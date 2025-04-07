package main.java.br.com.jrenan.domain;

import main.java.br.com.jrenan.anotação.TipoChave;
import main.java.br.com.jrenan.dao.Persistente;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Venda implements Persistente {

    public enum Status {
        INICIADA, CONCLUIDA, CANCELADA;
    }

    @TipoChave("getCodigo")
    private String codigo;

    private Cliente cliente;

    private Set<ProdutoQuantidade> produtos;

    private BigDecimal valorTotal;

    private Instant dataVenda;

    private Status status;

    public Venda() {
        produtos = new HashSet<>();
    }

    public void adicionarProduto(Produto produto, Integer quantidade) {
        validarStatus();
        Optional<ProdutoQuantidade> opcional =
                produtos.stream().filter(filter -> filter.getProduto().getCodigo().equals(produto.getCodigo())).findAny();
        if (opcional.isPresent()) {
            ProdutoQuantidade produtoQuantidade = opcional.get();
            produtoQuantidade.adicionar(quantidade);
        } else {
            ProdutoQuantidade produto1 = new ProdutoQuantidade();
            produto1.setProduto(produto);
            produto1.adicionar(quantidade);
            produtos.add(produto1);
        }
        recalcularValorTotalVenda();
    }

    private void validarStatus() {
        if (this.status == Status.CONCLUIDA) {
            throw new UnsupportedOperationException("IMPOSSÍVEL ALTERAR VENDA FINALIZADA");
        }
    }

    public void removerProduto(Produto produto, Integer quantidade) {
        validarStatus();
        Optional<ProdutoQuantidade> opcional =
                produtos.stream().filter(filter -> filter.getProduto().getCodigo().equals(produto.getCodigo())).findAny();

        if (opcional.isPresent()) {
            ProdutoQuantidade produtoQuantidade = opcional.get();
            if (produtoQuantidade.getQuantidade()>quantidade) {
                produtoQuantidade.remover(quantidade);
                recalcularValorTotalVenda();
            } else {
                produtos.remove(opcional.get());
                recalcularValorTotalVenda();
            }

        }
    }

    public void removerTodosProdutos() {
        validarStatus();
        produtos.clear();
        valorTotal = BigDecimal.ZERO;
    }

    public Integer getQuantidadeTotalProdutos() {
        int result = produtos.stream()
                .reduce(0, (partialCountResult, prod) -> partialCountResult + prod.getQuantidade(), Integer::sum);
        return result;
    }

    private void recalcularValorTotalVenda() {
        validarStatus();
        BigDecimal valorTotal = BigDecimal.ZERO;
        for (ProdutoQuantidade produto : this.produtos) {
            valorTotal = valorTotal.add(produto.getValorTotal());
        }
        this.valorTotal = valorTotal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Set<ProdutoQuantidade> getProdutos() {
        return produtos;
    }

    public void setProdutos(Set<ProdutoQuantidade> produtos) {
        this.produtos = produtos;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Instant getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Instant dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

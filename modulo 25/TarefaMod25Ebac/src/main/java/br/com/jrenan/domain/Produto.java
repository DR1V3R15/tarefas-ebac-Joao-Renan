package main.java.br.com.jrenan.domain;

import main.java.br.com.jrenan.anotação.TipoChave;
import main.java.br.com.jrenan.dao.Persistente;

import java.math.BigDecimal;

/**
 * @author João Renan
 *
 * Projeto 2 - Modulo 25 Ebac
 *
 */

public class Produto implements Persistente {

    private String nome;

    @TipoChave("getCodigo")
    private String codigo;

    private String descrição;

    private BigDecimal valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}

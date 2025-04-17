package br.com.jrenan.domain;

/**
 * @author João Renan
 *
 * Projeto 3 Back-End Java, Ebac
 */

public class Produto {

    private Long id;

    private String Nome;

    private String codigo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}

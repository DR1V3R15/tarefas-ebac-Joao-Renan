package JavaApplication.DOMAIN;

/**
 *
 * @author João Renan
 */
import java.util.Objects;

public class Cliente {

    private String nome;
    private Long cpf;
    private Long tel;
    private String end;
    private Integer numero;
    private String cidade;
    private String estado;

    public Cliente(String nome, String cpf, String tel, String end, String num, String cidade, String estado) {
        this.nome = nome;
        this.cpf = Long.valueOf(cpf.trim());
        this.tel = Long.valueOf(tel.trim());
        this.end = end;
        this.numero = Integer.valueOf(num.trim());
        this.cidade = cidade;
        this.estado = estado;

    }

    public java.lang.String getNome() {
        return nome;
    }

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    public java.lang.Long getCpf() {
        return cpf;
    }

    public void setCpf(java.lang.Long cpf) {
        this.cpf = cpf;
    }

    public java.lang.Long getTel() {
        return tel;
    }

    public void setTel(java.lang.Long tel) {
        this.tel = tel;
    }

    public java.lang.String getEnd() {
        return end;
    }

    public void setEnd(java.lang.String end) {
        this.end = end;
    }

    public java.lang.Integer getNumero() {
        return numero;
    }

    public void setNumero(java.lang.Integer numero) {
        this.numero = numero;
    }

    public java.lang.String getCidade() {
        return cidade;
    }

    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }

    public java.lang.String getEstado() {
        return estado;
    }

    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) object;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Nome = " + nome +
                ", CPF = " + cpf +
                ", Telefone = " + tel;
    }
}

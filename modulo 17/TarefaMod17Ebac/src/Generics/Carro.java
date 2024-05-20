package Generics;

/**
 * @author João Renan
 */

public abstract class Carro {

    public String modelo;
    public String cor;
    public Long potencia;

    public void Carro(String modelo, String cor, Long potencia) {
        this.modelo = modelo;
        this.cor = cor;
        this.potencia = potencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Long getPotencia() {
        return potencia;
    }

    public void setPotencia(Long potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Modelo: " + this.getModelo() +
                " - cor: " + this.getCor() +
                " - potencia em cavalos: " + this.getPotencia();
    }
}
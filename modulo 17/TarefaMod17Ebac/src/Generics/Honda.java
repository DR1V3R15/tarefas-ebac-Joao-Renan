package Generics;

/**
 * @author João Renan
 */

public class Honda {

    public String modelo;
    public String cor;
    public Long potencia;

    public void Carro(String modelo, String cor, Long potencia) {
        this.modelo = modelo;
        this.cor = cor;
        this.potencia = potencia;
    }

    public String getModelo() {
        return "Civic";
    }

    public String getCor() {
        return "Branco";
    }


    public Long getPotencia() {
        return 120L;
    }


    @Override
    public String toString() {
        return "Modelo: " + this.getModelo() +
                " - cor: " + this.getCor() +
                " - potencia em cavalos: " + this.getPotencia();
    }
}

package br.com.jrenan.FactoryMethodTeste;

public class CarroEuropeu implements ICarro {
    @Override
    public void ligarMotor() {
        System.out.println("Ligando o motor Diesel do carro europeu. ");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando o carro europeu com motor diesel! ");
    }

    @Override
    public void freiar() {
        System.out.println("Freiando o carro... ");
    }

    @Override
    public void desligarMotor() {
        System.out.println("Desligando o motor do carro. ");
    }
}

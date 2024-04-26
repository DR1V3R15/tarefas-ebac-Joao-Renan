package br.com.jrenan.FactoryMethodTeste;

public class CarroAmericano implements ICarro {
    @Override
    public void ligarMotor() {
        System.out.println("Ligando o motor V8 do carro americano. ");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando o carro americano com motor V8! ");
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

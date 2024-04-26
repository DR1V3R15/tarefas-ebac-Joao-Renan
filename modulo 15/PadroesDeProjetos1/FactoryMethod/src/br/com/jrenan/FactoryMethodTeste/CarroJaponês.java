package br.com.jrenan.FactoryMethodTeste;

public class CarroJaponês implements ICarro {
    @Override
    public void ligarMotor() {
        System.out.println("Ligando o motor 4 cilindros do carro japonês. ");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando o carro japonês com motor 4 cilindros! ");
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

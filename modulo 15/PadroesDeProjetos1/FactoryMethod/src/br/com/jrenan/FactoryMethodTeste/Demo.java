package br.com.jrenan.FactoryMethodTeste;

public class Demo {

    public static void main(String[] args) {
        FabricaDeCarros fabricaDeCarros = new FabricaDeCarros();

        ICarro carroAmericano = fabricaDeCarros.getCarro("Americano");
        carroAmericano.ligarMotor();
        carroAmericano.acelerar();
        carroAmericano.freiar();
        carroAmericano.desligarMotor();
        System.out.println("");

        ICarro carroEuropeu = fabricaDeCarros.getCarro("Europeu");
        carroEuropeu.ligarMotor();
        carroEuropeu.acelerar();
        carroEuropeu.freiar();
        carroEuropeu.desligarMotor();
        System.out.println("");

        ICarro carroJaponês = fabricaDeCarros.getCarro("Japonês");
        carroJaponês.ligarMotor();
        carroJaponês.acelerar();
        carroJaponês.freiar();
        carroJaponês.desligarMotor();
        System.out.println("");
    }
}

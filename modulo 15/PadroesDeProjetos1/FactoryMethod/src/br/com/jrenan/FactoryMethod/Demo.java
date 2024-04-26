package br.com.jrenan.FactoryMethod;

public class Demo {

    public static void main(String[] args) {
        FabricaDeCarros fabricaDeCarros = new FabricaDeCarros();

        ICarro bmw = fabricaDeCarros.getCarro("Bmw");
        bmw.tipoDeMotor("combustão, 6 cilindros em linha");
        bmw.potencia(320);
        bmw.cor("azul escuro");
        System.out.println("");

        ICarro tesla = fabricaDeCarros.getCarro("Tesla");
        tesla.tipoDeMotor("elétrico, 2 baterias");
        tesla.potencia(800);
        tesla.cor("vermelho metálico");
        System.out.println("");

        ICarro toyota = fabricaDeCarros.getCarro("Toyota");
        toyota.tipoDeMotor("híbrido, 3 cilindros em linha + 1 bateria");
        toyota.potencia(350);
        toyota.cor("branco satinado");
        System.out.println("");
    }
}

package br.com.jrenan.FactoryMethod;

public class CarroTesla implements ICarro {
    @Override
    public void tipoDeMotor(String motor) {
        System.out.println("O seu novo Tesla tem motor " + motor + ", e está pronto para ser utilizado!");
    }

    @Override
    public void potencia(Integer cavalosDePotencia) {
        System.out.println("Esse carro possui um potencia de até " + cavalosDePotencia + " cavalos!");
    }

    @Override
    public void cor(String cor) {
        System.out.println("O seu carro está pintado na cor " + cor + ", uma cor muito elegante!");
    }
}

package br.com.jrenan.FactoryMethodTeste;

public class FabricaDeCarros {

    public ICarro getCarro(String tipoDeCarro) {
        if (tipoDeCarro == null){
            return null;
        }

        if (tipoDeCarro.equalsIgnoreCase("Americano")){
            return new CarroAmericano();
        } else if (tipoDeCarro.equalsIgnoreCase("Europeu")){
            return new CarroEuropeu();
        } else if (tipoDeCarro.equalsIgnoreCase("Japonês")){
            return new CarroJaponês();
        }

        return null;
    }
}

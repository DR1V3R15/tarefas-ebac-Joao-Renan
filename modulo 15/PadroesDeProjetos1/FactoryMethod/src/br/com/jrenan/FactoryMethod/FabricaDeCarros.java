package br.com.jrenan.FactoryMethod;

public class FabricaDeCarros {

    public ICarro getCarro(String marcaDoCarro) {
        if (marcaDoCarro == null){
            return null;
        }

        if (marcaDoCarro.equalsIgnoreCase("Toyota")){
            return new CarroToyota();
        } else if (marcaDoCarro.equalsIgnoreCase("Bmw")){
            return new CarroBmw();
        } else if (marcaDoCarro.equalsIgnoreCase("Tesla")){
            return new CarroTesla();
        }

        return null;
    }
}

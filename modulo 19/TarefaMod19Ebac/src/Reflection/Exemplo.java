package Reflection;

@Tabela(value = "Exemplo de anotação")

public class Exemplo {
    @Tabela(value = "Exemplo de campo")
    private String tabela;

    @Tabela(value = "Exemplo de método")
    public void exemploTabela() {
        System.out.println("Tabela em Reflections.");
    }
}

package OrientacaoObjetos;

public class Programa {
    public static void main(String[] args) {
        PessoaFisica pessoa = new PessoaFisica();
        pessoa.setNumeroCpf("123.456.789-00");
        pessoa.setNome("João");
        pessoa.setSobrenome("Silva");
        pessoa.setIdade(20);
        System.out.println("Olá " + pessoa.getNome() + ", seu número de CPF é: " +
                pessoa.getNumeroCpf());

        PessoaJuridica pessoa2 = new PessoaJuridica();
        pessoa2.setNumeroCnpj("12.345.678/9012-34");
        pessoa2.setNome("Yuri");
        pessoa2.setSobrenome("Ramos");
        pessoa2.setIdade(25);
        System.out.println("Olá " + pessoa2.getNome() + ", seu número de CNPJ é: " +
                pessoa2.getNumeroCnpj());
    }
}

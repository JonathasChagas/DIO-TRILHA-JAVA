package POO.Exercicio1;
/*
Exercício 1: Modelagem de Pessoas e Funcionários
Crie uma classe Pessoa com os seguintes atributos:

nome (String)
idade (int)
Crie uma subclasse Funcionario que herda de Pessoa e tem os seguintes atributos adicionais:

cargo (String)
salario (double)
A Pessoa deve ter métodos getters e setters para os atributos nome e idade. O Funcionario também deve ter getters e setters para cargo e salario.

Teste o código criando objetos Pessoa e Funcionario e imprimindo os atributos.
*/


public class Main
{
    public static void main(String[] args)
    {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        pessoa.setNome("Ricardo");
        pessoa.setIdade(18);

        System.out.println("Nome: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade());

        funcionario.setNome("Letícia");
        funcionario.setIdade(25);
        funcionario.setCargo("Presidenta");
        funcionario.setSalario(20000.5);

        System.out.println("Nome: " + funcionario.getNome() + ", Idade: " + funcionario.getIdade() + ", Cargo: " + funcionario.getCargo() + ", Salário: " + funcionario.getSalario());

    }
}

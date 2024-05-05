package POO.Exercicio1;

public class Funcionario extends Pessoa
{
    String cargo;
    double salario;

    public String getCargo()
    {
        return cargo;
    }

    public double getSalario()
    {
        return salario;
    }

    public void setCargo(String cargo)
    {
        this.cargo = cargo;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }
}

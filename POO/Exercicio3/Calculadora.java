package POO.Exercicio3;

public class Calculadora implements OperacoesMatemarticas
{
    @Override
    public int somar(int a, int b)
    {
        return a + b;
    }

    @Override
    public int subtrair(int a, int b)
    {
        return a - b;
    }

    @Override
    public int multiplicar(int a, int b)
    {
        return a * b;
    }

    @Override
    public double dividir(int a, int b)
    {
        if(b == 0)
            return 0;

        return (double) a / b;
    }
}

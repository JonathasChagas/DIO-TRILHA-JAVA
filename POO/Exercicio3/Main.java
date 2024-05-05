package POO.Exercicio3;

public class Main
{
    public static void main(String[] args)
    {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.somar(5,10));
        System.out.println(calculadora.subtrair(5, 25));
        System.out.println(calculadora.multiplicar(2, 45));
        System.out.println(calculadora.dividir(10,0));
    }
}

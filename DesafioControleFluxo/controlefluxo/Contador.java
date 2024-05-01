package DesafioControleFluxo.controlefluxo;
import java.util.Scanner;

class ParametrosInvalidosException extends Exception
    {
        public ParametrosInvalidosException(String mensagem)
        {
            super(mensagem);
        }
    }

public class Contador 
{
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite o primeiro número: ");
        int numero1 = ler.nextInt();
        System.out.printf("Digite o segundo número: ");
        int numero2 = ler.nextInt();

        try
        {
            contar(numero1, numero2);
        }

        catch (ParametrosInvalidosException e)
        {
            System.out.println("Número 1 não pode ser maior que número 2!");
        }

        ler.close();
    }
    

    static void contar(int numero1, int numero2) throws ParametrosInvalidosException
    {
        if (numero1 > numero2)
        {
            throw new ParametrosInvalidosException("Algo deu errado!");
        }

        int contagem = numero2 - numero1;

        for (int i = 0; i < contagem; i++)
        {
            System.out.println("Imprimindo o número " + (i+1));
        }
    }

}

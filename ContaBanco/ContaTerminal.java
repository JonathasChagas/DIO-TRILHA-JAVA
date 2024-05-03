import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args){

        Scanner ler = new Scanner(System.in);

        int numero;
        String agencia, nomeCliente;
        float saldo;
    
        System.out.println("Digite seu nome: ");
        nomeCliente = ler.next();

        System.out.println("Digite a sua agência: ");
        agencia = ler.next();

        System.out.println("Digite o número da agência: ");
        numero = ler.nextInt();

        System.out.println("Digite seu saldo: ");
        saldo = ler.nextFloat();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco. Sua agência é: "+agencia+", conta "+numero+", e seu saldo "+saldo+" já está disponível para saque.");
        

        ler.close();
    }
}

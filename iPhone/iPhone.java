package iPhone;

public class iPhone implements AparelhoTelefonico, Navegador, ReprodutorMusical
{

    public static void main(String[] args)
    {
        iPhone iphone = new iPhone();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }

    @Override
    public void tocar()
    {
        System.out.println("Música tocando...");
    }

    @Override
    public void pausar()
    {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica()
    {
        System.out.println("Escolha a música.");
    }

    @Override
    public void ligar()
    {
        System.out.println("Ligando...");
    }

    @Override
    public void atender()
    {
        System.out.println("Telefone atendido!");
    }

    @Override
    public void iniciarCorreioVoz()
    {
        System.out.println("Ouvindo o correio de voz...");
    }

    @Override
    public void exibirPagina()
    {
        System.out.println("Exibindo página...");
    }

    @Override
    public void adicionarNovaAba()
    {
        System.out.println("Nova aba aberta.");
    }

    @Override
    public void atualizarPagina()
    {
        System.out.println("Pagina atualizada!");
    }
}

package POO.Exercicio2;

/*
Crie uma classe abstrata Animal com o seguinte método abstrato:

fazerSom(): Um método abstrato que as subclasses devem implementar para definir o som que o animal faz.
Crie subclasses Cachorro e Gato que herdam de Animal e implementam o método fazerSom(). Em Cachorro, o som deve ser um latido, e em Gato, um miado.

Crie uma lista de objetos Animal (pode ser uma lista de cachorros e gatos misturados) e chame o método fazerSom() em cada um deles.
*/

public class Main
{
    public static void main(String[] args)
    {
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();

        gato.fazerSom();
        cachorro.fazerSom();
    }
}

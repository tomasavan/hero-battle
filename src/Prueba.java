public class Prueba {
    public static void main(String[] args) {

        Heroe he1 = new Heroe("Axe");
        he1.daño = (int) (Math.random() * 10) + 1;
        he1.atributo = "fuerza";
        he1.nivel = 1;
        he1.puntosDeVida = 103;
        he1.fuerza = 10;
        he1.agilidad = 5;
        he1.inteligencia = 2;

        Heroe he2 = new Heroe("Invoker");
        he2.atributo = "inteligencia";
        he2.nivel = 1;
        he2.puntosDeVida = 96;
        he2.fuerza = 3;
        he2.agilidad = 6;
        he2.inteligencia = 11;


        System.out.println("La Batalla ha Comenzado");
        he1.moverse();
        he2.moverse();
        System.out.println(he2.nombre + " tiro albondiga!");
        System.out.println(he1.nombre + " esquivo");
        he2.atacar(he1);
        he1.atacar(he2);
        he1.atacar(he2);
        he1.atacar(he2);
        he1.atacar(he2);
        System.out.println(he1.nombre + " Ha Ganado");

    }
}

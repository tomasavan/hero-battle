public class Prueba {
    public static void main(String[] args) {

        Heroe he1 = new Heroe("Axe","Fuerza",
                650,22,9, 13);

        Heroe he2 = new Heroe("Invoker","Inteligencia",
                550,13, 6,23);

        for (int i = 10;i > 0; i--){
            System.out.println("La Batalla comienza en: " + i);
            if (i == 1)
                System.out.println("La Batalla ha Comenzado");


        }

        he1.moverse();
        he2.moverse();
        //System.out.println(he2.nombre + " tiro albondiga!");
        //System.out.println(he1.nombre + " esquivo");
        he2.atacar(he1);
        he1.atacar(he2);
        he1.atacar(he2);
        he1.atacar(he2);
        he1.atacar(he2);
        //System.out.println(he1.nombre + " Ha Ganado");

    }
}

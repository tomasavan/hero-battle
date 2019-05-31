import java.util.Random;

public class Prueba {
    public static void main(String[] args) throws InterruptedException {

        Heroe axe = new Heroe("Axe", "Fuerza",
                650, 22, 9, 13);

        Heroe kael = new Heroe("Invoker", "Inteligencia",
                550, 13, 6, 23);

        for (int i = 3; i > 0; i--){
            System.out.println("La Batalla comienza en: " + i);
            Thread.sleep(1000);
        }
        System.out.println("La Batalla ha Comenzado");
        while (axe.estarVivo() && kael.estarVivo()) {
            int numeroReflejo;
            numeroReflejo = dameNumeroReflejo(2);
            if (numeroReflejo == 1) axe.atacar(kael);
            else kael.atacar(axe);
            Thread.sleep(1000);

        }
        System.out.println("Termino la pelea");

    }

    public static int dameNumeroReflejo(int numeroMaximo) {
        int numero = (int) (Math.random() * numeroMaximo) + 1;
        return numero;
    }
}

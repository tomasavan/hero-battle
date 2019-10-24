public class Prueba {

    public static void main(String[] args) throws InterruptedException {

        Carry Phantom = new Carry("Phantom Assasin", "Agilidad",
                650, 13, 22, 10);

        Support Kael = new Support("Invoker", "Inteligencia",
                550, 13, 6, 23);

        for (int i = 3; i > 0; i--) {
            System.out.println("La Batalla comienza en: " + i);
            Thread.sleep(1000);
        }
        System.out.println("La Batalla ha Comenzado");
        while (Phantom.estarVivo() && Kael.estarVivo()) {
            int numeroReflejo;
            numeroReflejo = dameNumeroReflejo(2);
            if (numeroReflejo == 1) Phantom.atacar(Kael);
            else Kael.atacar(Phantom);
            Thread.sleep(1000);

        }
        System.out.println("Termino la pelea");
    }

    public static int dameNumeroReflejo(int numeroMaximo) {
        int numero = (int) (Math.random() * numeroMaximo) + 1;
        return numero;
    }


}



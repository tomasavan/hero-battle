public class Carry extends Heroe {

    public Carry(String nombre, String atributo, int puntosDeVida, int fuerza, int agilidad, int inteligencia) {
        super(nombre, atributo, puntosDeVida, fuerza, agilidad, inteligencia);
    }


    @Override
    public void atacar(Unidad enemigo) {
        super.atacar(enemigo);
        int numero = dameNumeroReflejo(10);
        switch (numero) {
            case 9 & 10:
                System.out.println(nombre + " ataco con un critico a " + enemigo.nombre + "!!");
                enemigo.perderVida(daño * 2);
                subirDeNivel();
                break;

        }
    }
}

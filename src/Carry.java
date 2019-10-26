public class Carry extends Heroe {

    public Carry(String nombre, String atributo, int puntosDeVida, int fuerza, int agilidad, int inteligencia) {
        super(nombre, atributo, puntosDeVida, fuerza, agilidad, inteligencia);
    }

    public void atacar(Heroe heroeEnemigo) {
        super.atacar(heroeEnemigo);
        int numero = dameNumeroReflejo(10);
        switch (numero) {
            case 9 & 10:
                System.out.println(nombre + " ataco con un critico a " + heroeEnemigo.nombre + "!!");
                heroeEnemigo.perderVida(daño * 2);
                subirDeNivel();
                break;

        }
    }
}

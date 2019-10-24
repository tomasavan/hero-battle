public class Carry extends Heroe {

    public Carry(String nombre, String atributo, int puntosDeVida, int fuerza, int agilidad, int inteligencia) {
        super(nombre, atributo, puntosDeVida, fuerza, agilidad, inteligencia);
    }

    public void atacar(Heroe heroeEnemigo) {
        super.atacar(heroeEnemigo);
        if (dameNumeroReflejo(10) >= 9) {
            subirDeNivel();
        }
    }
}
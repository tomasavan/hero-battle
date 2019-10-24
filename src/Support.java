public class Support extends Heroe {
    public Support(String nombre, String atributo,
                   int puntosDeVida, int fuerza,
                   int agilidad, int inteligencia) {
        super(nombre, atributo,
                puntosDeVida, fuerza,
                agilidad, inteligencia);
    }

    public void atacar(Heroe heroeEnemigo) {
        super.atacar(heroeEnemigo);
    }
}

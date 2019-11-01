public class Estructura extends Unidad {
    public int escudo;

    public Estructura(String nombre, int daño,
                      int nivel, int puntosDeVida, int escudo) {

    }

    @Override
    public void atacar(Unidad enemigo) {
        System.out.println(nombre + " ataca a " + enemigo.nombre);
        enemigo.perderVida(daño);
    }

    @Override
    protected boolean estarVivo() {
        if (puntosDeVida > 0)
            return true;
        else return false;
    }
}

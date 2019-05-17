public class Heroe {

    String nombre;
    String atributo;
    int daño;
    int nivel;
    int puntosDeVida;
    int fuerza;
    int agilidad;
    int inteligencia;

    public Heroe(String nombre) {
        this.nombre = nombre;
    }

    void moverse() {
        System.out.println(nombre + " se movio");
    }

    void atacar(Heroe heroeEnemigo) {
        System.out.println(nombre + " ataca al " + heroeEnemigo.nombre);
        heroeEnemigo.perderVida(daño);
    }

    void perderVida(int daño) {
        puntosDeVida = puntosDeVida - daño;

        if (puntosDeVida <= 0) {
            System.out.println(nombre + ": he muerto");
        } else {
            System.out.println(nombre + ": perdi "
                    + daño + " de vida, me quedan " + puntosDeVida);
        }
    }

}
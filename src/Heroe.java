public class Heroe {

    private String nombre;
    private String atributo;
    private int daño;
    private int nivel;
    private int puntosDeVida;
    private int fuerza;
    private int agilidad;
    private int inteligencia;



    public Heroe(String nombre, String atributo,
                 int puntosDeVida, int fuerza,
                 int agilidad, int inteligencia) {
        this.nombre = nombre;
        this.atributo = atributo;
        this.puntosDeVida = puntosDeVida;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.inteligencia = inteligencia;
        this.nivel = nivel;
        if (atributo.equals("Fuerza") == true) {
            daño = fuerza;
        }
        if (atributo.equals("Agilidad") == true) {
            daño = agilidad;
        }
        if (atributo.equals("Inteligencia") == true) {
            daño = inteligencia;
        }
    }


    void atacar(Heroe heroeEnemigo) {
        if (dameNumeroReflejo(10) >= 9) {
            System.out.println(nombre + " ataco con un critico al " + heroeEnemigo.nombre + "!!");
            heroeEnemigo.perderVida(daño * 2);
        } else {
            if (dameNumeroReflejo(10)==1) {
                System.out.println(nombre + " ha fallado el ataque!!");
            } else {
            System.out.println(nombre + " ataca al " + heroeEnemigo.nombre);
            heroeEnemigo.perderVida(daño);
            }
        }
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

    boolean estarVivo() {
        if (puntosDeVida > 0)
            return true;
        else return false;

    }

    private int dameNumeroReflejo(int numeroMaximo) {
        int numero = (int) (Math.random() * numeroMaximo) + 1;
        return numero;
    }
}
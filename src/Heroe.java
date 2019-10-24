public class Heroe {

    protected String nombre, atributo;
    protected int daño, nivel, puntosDeVida, fuerza, agilidad, inteligencia;

    public Heroe(String nombre, String atributo,
                 int puntosDeVida, int fuerza,
                 int agilidad, int inteligencia) {
        this.nombre = nombre;
        this.atributo = atributo;
        this.puntosDeVida = puntosDeVida;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.inteligencia = inteligencia;
        this.nivel = 1;
        if (atributo.equals("Fuerza")) {
            daño = fuerza;
        }
        if (atributo.equals("Agilidad") == true) {
            daño = agilidad;
        }
        if (atributo.equals("Inteligencia") == true) {
            daño = inteligencia;
        }
    }


    protected void atacar(Heroe heroeEnemigo) {
        if (dameNumeroReflejo(10) >= 9) {
            System.out.println(nombre + " ataco con un critico a " + heroeEnemigo.nombre + "!!");
            heroeEnemigo.perderVida(daño * 2);
        } else if (dameNumeroReflejo(10) == 1) {
            fallarAtaque();
        } else {
            System.out.println(nombre + " ataca a " + heroeEnemigo.nombre);
            heroeEnemigo.perderVida(daño);
        }
    }
       public void fallarAtaque(){
           System.out.println(nombre + " ha fallado el ataque!!");
       }

    protected void perderVida(int daño) {
        puntosDeVida = puntosDeVida - daño;

        if (puntosDeVida <= 0) {
            System.out.println(nombre + ": he muerto");
        } else {
            System.out.println(nombre + ": perdi "
                    + daño + " de vida, me quedan " + puntosDeVida);
        }

    }

    protected void subirDeNivel() {
        nivel++;
        System.out.println(nombre + " ha subido a nivel " + nivel);
    }


    protected boolean estarVivo() {
        if (puntosDeVida > 0)
            return true;
        else return false;

    }

    protected int dameNumeroReflejo(int numeroMaximo) {
        int numero = (int) (Math.random() * numeroMaximo) + 1;
        return numero;
    }


}
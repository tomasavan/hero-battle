public class Unidad {
    protected String nombre;
    protected int daño, nivel, puntosDeVida;


     public void atacar (Unidad enemigo){
         System.out.println(nombre + " ataca a " + enemigo.nombre);
         enemigo.perderVida(daño);
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

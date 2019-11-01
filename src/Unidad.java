public abstract class Unidad {
    protected String nombre;
    protected int daño, nivel, puntosDeVida;


     public abstract void atacar (Unidad enemigo);

     protected void perderVida(int daño) {
        puntosDeVida = puntosDeVida - daño;

        if (puntosDeVida <= 0) {
            System.out.println(nombre + ": he muerto");
        } else {
            System.out.println(nombre + ": perdi "
                    + daño + " de vida, me quedan " + puntosDeVida);
        }

    }
    protected abstract boolean estarVivo();


    protected int dameNumeroReflejo(int numeroMaximo) {
        int numero = (int) (Math.random() * numeroMaximo) + 1;
        return numero;
    }
}

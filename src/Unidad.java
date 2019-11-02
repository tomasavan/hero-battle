public abstract class Unidad implements UnidadAcción {
    protected String nombre;
    protected int daño, nivel, puntosDeVida;


    public abstract void atacar(Unidad enemigo);

    public void perderVida(int daño) {
        puntosDeVida = puntosDeVida - daño;

        if (puntosDeVida <= 0) {
            System.out.println(nombre + ": he muerto");
        } else {
            System.out.println(nombre + ": perdi "
                    + daño + " de vida, me quedan " + puntosDeVida);
        }

    }

    public boolean estarVivo() {
        if (puntosDeVida > 0)
            return true;
        else return false;
    }

    public int dameNumeroReflejo(int numeroMaximo) {
        int numero = (int) (Math.random() * numeroMaximo) + 1;
        return numero;
    }
}

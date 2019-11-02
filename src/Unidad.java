public abstract class Unidad {
    protected String nombre;
    protected int nivel;
    protected long daño, puntosDeVida;


    public abstract void atacar(Unidad enemigo);

    public void perderVida(long daño) {
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

    protected int dameNumeroReflejo(int numeroMaximo) {
        int numero = (int) (Math.random() * numeroMaximo) + 1;
        return numero;
    }

}

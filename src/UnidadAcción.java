public interface UnidadAcción {
    public void atacar(Unidad enemigo);

    public void perderVida(int daño);

    public abstract boolean estarVivo();

    public int dameNumeroReflejo(int numeroMaximo);
}







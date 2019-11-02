public class Creep extends Unidad {
    public Creep(String nombre, int daño, int nivel,
                 int puntosDeVida) {

    }

    public void atacar(Unidad enemigo) {
        System.out.println(nombre + " ataca a " + enemigo.nombre);
        enemigo.perderVida(daño);

    }
}

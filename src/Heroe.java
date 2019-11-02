public class Heroe extends Unidad {

    protected String atributo;
    protected int fuerza, agilidad, inteligencia;

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
        if (atributo.equals("Agilidad")) {
            daño = agilidad;
        }
        if (atributo.equals("Inteligencia")) {
            daño = inteligencia;
        }
    }

    @Override
    public void atacar(Unidad enemigo) {
        int numero = dameNumeroReflejo(10);
        switch (numero) {
            case 9 & 10:
                System.out.println(nombre + " ataco con un critico a " + enemigo.nombre + "!!");
                enemigo.perderVida(daño * 2);
                break;
            case 1:
                fallarAtaque();
                break;
                default:
                    System.out.println(nombre + " ataca a " + enemigo.nombre);
                    enemigo.perderVida(daño);

        }
    }

    protected void fallarAtaque() {
        System.out.println(nombre + " ha fallado el ataque!!");
    }

    protected void subirDeNivel() {
        nivel++;
        System.out.println(nombre + " ha subido a nivel " + nivel);
    }

}
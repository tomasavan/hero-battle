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
        if (atributo.equals("Agilidad") == true) {
            daño = agilidad;
        }
        if (atributo.equals("Inteligencia") == true) {
            daño = inteligencia;
        }
    }


    public void atacar(Unidad enemigo) {
        super.atacar(enemigo);
        int numero = dameNumeroReflejo(10);
        switch (numero) {
            case 9 & 10:
                System.out.println(nombre + " ataco con un critico a " + enemigo.nombre + "!!");
                enemigo.perderVida(daño * 2);
                break;
            case 1:
                fallarAtaque();
                break;

        }
    }

    public void fallarAtaque() {
        System.out.println(nombre + " ha fallado el ataque!!");
    }



    protected void subirDeNivel() {
        nivel++;
        System.out.println(nombre + " ha subido a nivel " + nivel);
    }




}
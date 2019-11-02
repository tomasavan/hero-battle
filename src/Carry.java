public class Carry extends Heroe implements Core {

    public Carry(String nombre, String atributo, int puntosDeVida, int fuerza, int agilidad, int inteligencia) {
        super(nombre, atributo, puntosDeVida, fuerza, agilidad, inteligencia);
    }

    @Override
    public void atacar(Unidad enemigo) {
        int numero = dameNumeroReflejo(10);
        switch (numero) {
            case 9 & 10:
                switch (nivel) {
                    case 1:
                        System.out.println((char) 27 + "[30;35m" + nombre + " ataco con un critico a " + enemigo.nombre + "!!" + (char) 27 + "[30;37m");
                        enemigo.perderVida(daño * 2);
                        subirDeNivel();
                        break;
                    case 2:
                        System.out.println((char) 27 + "[30;35m" + nombre + " ataco con un critico a " + enemigo.nombre + "!!" + (char) 27 + "[30;37m");
                        enemigo.perderVida((long) (daño * 2.5));
                        subirDeNivel();
                        break;
                    case 3:
                        System.out.println((char) 27 + "[30;35m" + nombre + " ataco con un critico a " + enemigo.nombre + "!!" + (char) 27 + "[30;37m");
                        enemigo.perderVida((long) (daño * 3));
                        break;
                }
            case 1:
                fallarAtaque();
                break;
            default:
                System.out.println(nombre + " ataca a " + enemigo.nombre);
                enemigo.perderVida(daño);
        }

    }
}

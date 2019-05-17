public class Main {

    public static void main(String[] args) {
        //System.out.println("Macaco6");
        //String user="Tomi";
        //System.out.println(user + " chupala");

        hacerQueUnUsuarioLaChupe("July3p", false);

    }

    static void hacerQueUnUsuarioLaChupe(String user, boolean esGordo) {
        if (esGordo==true){
            System.out.println(user + " chupala gordo");
        }
        else {
            System.out.println(user + " chupala");
        }
    }
}

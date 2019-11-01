import java.util.ArrayList;
import java.util.List;

public class Mapa {

    protected String morgos, steed, estructura, creep;

    public Mapa(String morgos, String steed,
                String estructuras, String creeps) {

        List<Creep> creepList = new ArrayList<Creep>();
        creepList.add(new Creep("Creep Melee", 20,
                1, 330));
        creepList.add(new Creep("Creep a Distancia", 33,
                1, 300));

        List<Estructura> estructuraList = new ArrayList<Estructura>();

        estructuraList.add(new Estructura("Torre", 40,
                4, 900, 5));
        estructuraList.add(new Estructura("Barraca", 0,
                10, 1300, 8));


    }
}

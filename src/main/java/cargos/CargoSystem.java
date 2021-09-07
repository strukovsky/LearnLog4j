package cargos;

import org.apache.log4j.Logger;

import java.util.HashSet;
import java.util.LinkedList;

public class CargoSystem {
    private static final LinkedList<Integer> ids = new LinkedList<>();
    private static final Logger log = Logger.getLogger(CargoSystem.class);
    /*
    Checks whether there's already such id in database; if all is ok, there's no such id, return true else false
     */
    public static boolean add(int id)
    {

        if(ids.contains(id))
        {
            log.error("Id already exists: " + id);
            return false;
        }
        log.info("Id is free: " + id);
        ids.add(id);
        return true;
    }

    public static void remove(int id) {
        ids.remove(Integer.valueOf(id));
    }
}

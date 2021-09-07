import cargos.Cargo;
import cargos.CargoSystem;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class PostOffice {
    List<Cargo> receivedCargos;
    private static final Logger logger = Logger.getLogger(PostOffice.class);

    public PostOffice()
    {
        receivedCargos = new ArrayList<>();
    }

    public void receiveCargo(Cargo c)
    {
        receivedCargos.add(c);
        logger.info("Received cargo " + c.getIdentifier());

    }

    public void giveOutCargo(int id)
    {
        int indexOfRequested = -1;
        int iterator = 0;
        for (Cargo c: receivedCargos)
        {
            if (c.getIdentifier() == id) {
                indexOfRequested = iterator;
                break;
            }
            iterator++;
        }
        if(indexOfRequested != -1)
        {
            receivedCargos.remove(indexOfRequested);
            CargoSystem.remove(id);
            logger.info("There's a cargo with requested id " + id + " removing from database of Post Office ");
        }
    }
}

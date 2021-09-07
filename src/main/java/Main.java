
import cargos.Cargo;
import org.apache.log4j.Logger;

import java.util.Date;

public class Main {
    public static void main(String[] args)
    {
        PostOffice office = new PostOffice();
        Cargo c = new Cargo("Dmitry", "Stepan", 1000);
        office.receiveCargo(c);
        Cargo c2 = new Cargo("Victor", "Masha", 2000);
        office.receiveCargo(c2);
        int id = c.getIdentifier();
        office.giveOutCargo(id);


    }
}


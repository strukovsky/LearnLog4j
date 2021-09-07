import org.apache.log4j.Logger;

public class OrderLogic {
    private static final Logger log = Logger.getLogger(OrderLogic.class);

    public void doOrder()
    {
        System.out.println("Order is created!");
        log.info("order is done in " + this);
        addToCart();
    }

    private void addToCart(){
        System.out.println("Stuff is in a basket");
        log.info("stuff is in a basket in class " + this);
    }
}
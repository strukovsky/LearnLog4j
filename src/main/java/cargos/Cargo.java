package cargos;

import org.apache.log4j.Logger;

import java.util.Date;

public class Cargo {
    private String sender;
    private String receiver;
    private int weightInGrams;
    private int identifier;

    private final Logger logger = Logger.getLogger(Cargo.class);
    public Cargo(String sender, String receiver, int weightInGrams)
    {
        this.sender = sender;
        this.receiver = receiver;
        this.weightInGrams = weightInGrams;
        long tmpId = HashCalculator.calculate(sender, receiver, weightInGrams);
        identifier = (int) (tmpId % 1000000);
        if(!CargoSystem.add(identifier))
        {

            identifier += 3;
            CargoSystem.add(identifier);
            logger.info("Add cargo with id "+identifier);
        }
    }
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }


    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }


    public int getWeightInGrams() {
        return weightInGrams;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getSender() {
        return sender;
    }

    public int getIdentifier() {
        return identifier;
    }


}

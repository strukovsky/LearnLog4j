package cargos;

import java.util.Date;

public class HashCalculator {
    public static int calculate(String sender, String receiver, int weightInGrams)
    {
        int senderLength = sender.length();
        int receiverLength = receiver.length();
        int A = senderLength * receiverLength % 31;
        int B = (senderLength + receiverLength + (senderLength * receiverLength * 13)) % weightInGrams;
        int C = (senderLength * weightInGrams + weightInGrams*(receiverLength<<2));
        return ((A+17) * (13+B)) * ((A % B)+1) * (C+7+A) % 31;
    }
}

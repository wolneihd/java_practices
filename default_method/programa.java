package default_method;

import default_method.services.BrazilInterestService;
import default_method.services.InterestService;
import default_method.services.UsaInterestService;

public class programa {
    
    public static void main(String[] args) {
        
        int months = 3;
        double amount = 200.0;

        InterestService isBR = new BrazilInterestService(2.0);
        double payment = isBR.payment(amount, months);
        System.out.println("Total a pagar BR: " + payment);

        InterestService isUsa = new UsaInterestService(1.0);
        double paymentUsa = isUsa.payment(amount, months);
        System.out.println("Total a pagar EUA: " + paymentUsa);
    }

}

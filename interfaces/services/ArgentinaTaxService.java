package interfaces.services;

public class ArgentinaTaxService implements TaxService {

    public double tax(double amount) {
        if (amount <= 100) {
            return amount * 0.18;
        } else {
            return amount * 0.12;
        }
    }
}

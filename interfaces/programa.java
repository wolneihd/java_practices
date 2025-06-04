package interfaces;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import interfaces.models.CarRental;
import interfaces.models.Invoice;
import interfaces.models.Vehicle;
import interfaces.services.ArgentinaTaxService;
import interfaces.services.BrazilTaxService;
import interfaces.services.RentalService;

public class programa {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Start:
        LocalDateTime start = LocalDateTime.parse("22/05/2025 08:55", fmt);

        // Finish
        LocalDateTime finish = LocalDateTime.parse("25/05/2025 09:16", fmt);

        // Inputs:
        Vehicle vehicle = new Vehicle("HB20");
        Invoice invoice = new Invoice();
        
        // Car Rental:
        CarRental crBrl = new CarRental(start, finish, vehicle, invoice);
        CarRental crArg = new CarRental(start, finish, vehicle, invoice);        

        // Rental Service (Brazil):
        RentalService rsBrl = new RentalService(10, 130, new BrazilTaxService());
        rsBrl.processInvoice(crBrl);

        // Rental Service (Argentina):
        RentalService rsArg = new RentalService(10, 130, new ArgentinaTaxService());
        rsArg.processInvoice(crArg);

        // Final:
        System.out.println(crBrl.toString());
        System.out.println(crArg.toString());
    }
}

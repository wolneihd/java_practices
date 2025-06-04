package _exercicios.interfaces;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import _exercicios.interfaces.models.Contract;
import _exercicios.interfaces.services.ContractService;
import _exercicios.interfaces.services.PaypalService;

public class programa {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Date:
        LocalDateTime dueTime = LocalDateTime.parse("22/05/2025 08:55", fmt);

        // Model:
        Contract contract = new Contract(1234, dueTime, 600);

        // Contract Service
        ContractService cs = new ContractService(new PaypalService());
        cs.processContract(contract, 3);

    }
}

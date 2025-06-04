package _exercicios.interfaces.services;

import java.time.LocalDateTime;

import _exercicios.interfaces.models.Contract;
import _exercicios.interfaces.models.Installment;

public class ContractService {
    
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
        System.out.println("Processando contrato número: " + contract.getNumber());

        double basicQuota = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDateTime dueDate = contract.getDate().plusMonths(i);
            double interest = this.onlinePaymentService.interest(basicQuota, i); 
            double fee = this.onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;
            contract.getInstallments().add(new Installment(dueDate, quota));
        }

        for (Installment installment: contract.getInstallments()) {
            System.out.println("Valor: " + installment.getAmount() + " | Vencimento: " + installment.getDueDate());
        }
    }
}

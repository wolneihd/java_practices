package _exercicios.interfaces.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    
    private Integer number;
    private LocalDateTime date;
    private double totalValue;

    private List<Installment> installments = new ArrayList<>();

    public Contract(Integer number, LocalDateTime date, double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

}

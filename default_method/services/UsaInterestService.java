package default_method.services;

public class UsaInterestService implements InterestService {
    
    private Double interest;

    public UsaInterestService(Double interest) {
        this.interest = interest;
    }    

    @Override
    public double getInterestRate() {
        return this.interest;
    }
}

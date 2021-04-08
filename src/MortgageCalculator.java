public class MortgageCalculator {
    private Double principal;
    private Float rate;
    private Float duration;

    public MortgageCalculator(Double principal, Float rate, Float duration) {
        this.principal = principal;
        this.rate = rate;
        this.duration = duration;
    }

    public Double calcMortgage(){
        return (principal)*(rate)*(duration)/100;
    }
}

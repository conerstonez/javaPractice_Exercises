package Practice.DeitelExercises.Chapter4;

public class SalesCommissionCalculator {
    private String name;
    private double sale;
    private double commission;

    public SalesCommissionCalculator (String name, double sale, double commission) {
        this.name = name;
        this.sale = sale;
        this.commission = commission;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSale(double sale) {
        if (sale > 0.0) {
            this.sale = sale;
        }
    }
    public String getName() {
        return name;
    }
    public double getSale() {
        return sale;
    }
    public double getCommission() {
        if (sale > 0.0) {
            commission = 200 + (0.09 * sale);
        }
        return commission;
    }
}

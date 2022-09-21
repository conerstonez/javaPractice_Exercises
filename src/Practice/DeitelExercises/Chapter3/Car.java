package Practice.DeitelExercises.Chapter3;

public class Car {
    private String carModel;
    private String yearOfProduction;
    private double amount;
        public Car (String carModel, String yearOfProduction, double amount) {
            this.carModel = carModel;
            this.yearOfProduction = yearOfProduction;
            if (amount > 0) {
                this.amount = amount;
            }
        }
        public void setCarModel (String name) {
            carModel = name;
        }
        public void setYearOfProduction (String year) {
            yearOfProduction = year;
        }
        public void setAmount (double amount) {
            this.amount =  amount;
        }
        public void setDiscount () {
            int discount = 0;
        }
        public String getCarModel () {
            return carModel;
        }
        public String getYearOfProduction() {
            return yearOfProduction;
        }
        public double getAmount() {
            return amount;
        }
}

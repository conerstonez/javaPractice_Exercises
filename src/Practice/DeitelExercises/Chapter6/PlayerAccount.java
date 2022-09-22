package Practice.DeitelExercises.Chapter6;

public class PlayerAccount {
    private String name;
    private int age;
    private double balance;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.print("Underage!");
        }
    }
    public void deposit(double amount){
        if (amount > 100.0) {
            balance += amount;
        }
        else{
            System.out.print("Minimum deposit amount is 100");
        }
    }
    public void withdraw(double withdrawAmount){
        if (balance > 1000) {
            balance -= withdrawAmount;
        }
    }
    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getBalance() {
        return balance;
    }
}

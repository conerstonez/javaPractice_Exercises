public class Account{ 
	private String name;
	private double balance;
		public Account (String name, double balance) {
			this.name = name;

			if (balance > 0.0) {
				this.balance = balance;
			}
		}
		public void deposit (double depositAmount)  {
			if (depositAmount > 0.0) {
				this.balance = balance + depositAmount;
			}
		}
		public double withdraw (double withdrawAmount)  {
			if (withdrawAmount <= balance) {
				this.balance = balance - withdrawAmount;
			}
			else {
				System.out.println ();
				System.out.println ("INSUFFICIENT FUND!");
			}
				return balance;
		}
		public void setBalance (double balance) {
			this.balance = balance;
		}
		public double getBalance () {
			return balance;
		}
		public void setName (String name) {
			this.name = name;
		}
		public String getName () {
			return name;
		}

}
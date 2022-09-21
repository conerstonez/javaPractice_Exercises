package Practice.DeitelExercises.Chapter3.petrol;

public class PetrolPurchase{

	private String location;
	private String petrolType;
	private int quantity;
	private double pricePerLitre;
	private double percentageDiscount;

		public PetrolPurchase (String location, String petrolType, double pricePerLitre, double percentageDiscount) {
			this.location = location;
			this.petrolType = petrolType;
			this.quantity = quantity;
			this.pricePerLitre = pricePerLitre;
			if (percentageDiscount > 0.0) {
				this.percentageDiscount = percentageDiscount;
		
			}
		}

		public void setLocation (String location) {
			this.location = location;
		}
		public String getLocation () {
			return location;
		}
		public void setPetrolType (String petrolType) {
			this.petrolType = petrolType;
		}
		public String getPetrolType () {
			return petrolType;
		}
		public void setQuantity (int quantity) {
			this.quantity = quantity;
		}
		public int getQuantity () {
			return quantity;
		}
		public void setPricePerLitre (double pricePerLitre) {
			this.pricePerLitre = pricePerLitre;
		}
		public double getPricePerLitre () {
			return pricePerLitre;
		}
		public void setPercentageDiscount (double percentageDiscount) {
			this.percentageDiscount = percentageDiscount;
		}
		public double getPercentageDiscount () {
			return percentageDiscount;
		}
		public double getPurchaseAmount () {
			double amount = (quantity * pricePerLitre);
			double discount = ((percentageDiscount / 100) * amount);
			double purchaseAmount = (amount - discount);
			return purchaseAmount;
		}
}
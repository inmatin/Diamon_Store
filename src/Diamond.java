
public class Diamond {

	// private double weight
	private double weight;
	private final double minimumPrice = 500.00;
	private final double pricePerCarat = 1000.00;

	public Diamond() {

	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;	
	
	}
	
	public double computePrice() {
		
		return minimumPrice + weight * pricePerCarat;
			
	}
	
}

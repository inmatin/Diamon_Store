
public class IshtiaqueMatin {

	public static void main(String[] args) {
		
		Diamond d1 = new Diamond();
		
		double weight = 1.25;
		
		d1.setWeight(weight);
		
				
		System.out.println("Diamond weight is " + d1.getWeight()  + " carats");
		System.out.println(d1.getWeight());
		System.out.println("Test work method: " + d1.computePrice());
		System.out.println("Program by Ishtiaque Matin");
	}

}

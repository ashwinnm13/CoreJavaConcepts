package Day5;

public class HierarchicalInheritance {

	public static void main(String[] args) {

		ECEDepartment ece1 = new ECEDepartment();
		ITDepartment it1 = new ITDepartment();
		
		ece1.student();
		ece1.ece();
		
		it1.student();
		it1.it();

	}

}

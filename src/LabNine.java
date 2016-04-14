import java.util.*;
public class LabNine {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		String another ="y";
		Circle circ = new Circle();
		double x = 0;
		do{
			System.out.println("Please enter a radius.");
		x = getValidNumberInRange(1, 1000);
		
	    circ.setRadius(x);
		System.out.println(circ.getFormattedArea());
		System.out.println(circ.getFormattedCircumference());
		System.out.println("Would you like to make another circle? (y/n)");
		 another = sc.nextLine();}
	while(another.equalsIgnoreCase("y"));
	}
			
		
		public static double getValidNumberInRange(double min, double max) {
			double x = readValidIntegerNoExp();
			while (x < min || x > max) {
				System.out.println("Please Enter a number within range");
				x= sc.nextInt();
				sc.nextLine();
			}
			return x;
		}

		public static double readValidIntegerNoExp() {
			while (true) {
				if (sc.hasNextDouble())
					break;
				System.out.println("Please enter an integer");
				sc.nextLine();
			}
			double x = sc.nextDouble();
			sc.nextLine();

			return x;
}
}
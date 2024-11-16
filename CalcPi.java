public class CalcPi {
	public static void main(String [] args) { 
		int times = Integer.parseInt(args[0]);
		double aproxPI = 0;
		double sign = 1.0;

		for (int i = 0; i < times; i++) {
			aproxPI += sign / ((i * 2.0) + 1.0);
			sign *= (-1.0);
		}
		System.out.println("pi according to java: " + Math.PI);
		System.out.println("pi, approximated      " + aproxPI * 4.0);		
	}	
}

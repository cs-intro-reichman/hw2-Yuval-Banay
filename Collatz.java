public class Collatz {
	public static void main(String args[]) {
		int maxSeed = Integer.parseInt(args[0]);
		String mode = args[1];
		boolean special = false;

		for (int seed = 1; seed <= maxSeed; seed++) { // generates rows of hailstone from 1 to maxSeed
			int x = seed;
			String output = x + " ";
			int count = 1;  			
			while (x != 1 || !special) { // Generates a hailstone sequence + number of steps
				if (!special) {
					special = true;
				}
				if ((x % 2) == 0) {
					x = (x / 2);
					output += (x + " ");
				} else {
					x = (x * 3) + 1;
					output += (x + " ");
				} count++;
			}
			if (mode.equals("v")) {
				System.out.println(output + "(" + count + ")");
			}
		}
		System.out.println("Every one of the first " + maxSeed + " hailstone sequences reached 1.");
	}
}
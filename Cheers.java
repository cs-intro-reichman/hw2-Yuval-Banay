public class Cheers {
        public static void main(String[] args) {
	    String cheerFor = args[0].toUpperCase();
            int times = Integer.parseInt(args[1]);

            for (int i = 0; i < cheerFor.length(); i++) {
                char a = cheerFor.charAt(i);
                if ("AEFHILMNORSX".indexOf(a) != -1) {
                        System.out.println("Give me an " + a + ": " + a + "!");
                } else {
                        System.out.println("Give me a  " + a + ": " + a + "!");
                }
            }
            System.out.println("What does that spell?");
            for (int i = 0; i < times; i++) {
                System.out.println(cheerFor + "!!!");
            }
        }
}

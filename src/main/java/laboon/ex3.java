public class ex3 {

	public int triangle(int arg1) {
		int sum = 0;
		sum = (arg1 * (arg1 + 1)) / 2;
		return sum;
	}

	public int lazyCaterer(int arg1) {
		int pieces = 0;
		pieces = ((arg1 * arg1) + arg1 + 2) / 2;
		return pieces;
	}

    
    public static void main(String[] args) {

    	int triResult = 0, caterResult = 0;

    	if (args.length() != 1) {
    		System.out.println("You have not entered 1 argument. Please try again!");
    		System.exit(1);
    	}

    	if (!(args[0] instanceof Integer)) {
    		System.out.println("The argument is not an integer. Please try again!");
    		System.exit(1);
    	}

    	triResult = triangle(args[0]);
    	System.out.println("Tri(" + args[0] + ") = " + triResult);
		caterResult = lazyCaterer(args[0]);
    	System.out.println("Lazy(" + args[0] + ") = " + caterResult);
    }
}

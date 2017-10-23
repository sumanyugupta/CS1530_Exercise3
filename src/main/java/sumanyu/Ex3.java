package sumanyu;

public class Ex3 {

	public static int triangle(int arg1) {
		int sum = 0;
		sum = (arg1 * (arg1 + 1)) / 2;
		return sum;
	}

	public static int lazyCaterer(int arg1) {
		int pieces = 0;
		pieces = ((arg1 * arg1) + arg1 + 2) / 2;
		return pieces;
	}

    
    public static void main(String[] args) {

        int n = 1;
    	int triResult = 0, caterResult = 0;

    	if (args.length != 1) {
    		System.out.println("You have not entered 1 argument. Please try again!");
    		System.exit(1);
    	}

        try {
            n = Integer.parseInt(args[0]); 
        } catch (NumberFormatException e) {	
    		System.out.println("The argument is not an integer. Please try again!");
    		System.exit(1);
    	}

    	triResult = triangle(n);
    	System.out.println("Tri(" + n + ") = " + triResult);
		caterResult = lazyCaterer(n);
    	System.out.println("Lazy(" + n + ") = " + caterResult);
    }
}

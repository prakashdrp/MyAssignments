package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int input = 13; 
        boolean isPrime = true;

        
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                isPrime = false;
                break; 
            }
        }

        
        if (isPrime && input > 1) {
            System.out.println(input + " is a Prime Number.");
        } else {
            System.out.println(input + " is Not a Prime Number.");
        }

	}

}

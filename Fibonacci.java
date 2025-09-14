package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		int range = 8; 
        int first = 0, second = 1;

        System.out.print("Fibonacci Series up to " + range + ": ");

       
        System.out.print(first + ", " + second);

        
        while (true) {
            int next = first + second;
            if (next > range) {
                break;
            }
            System.out.print(", " + next);
            first = second;
            second = next;
        }

        
        System.out.println(", " + (first + second)); 

	}

}

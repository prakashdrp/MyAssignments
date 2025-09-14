package week1.day2;

public class Palindromechk {

	public static void main(String[] args) {
		int input = 12566; 
        int reversed = 0;

        
        for (int i = input; i > 0; i /= 10) {
            int rem = i % 10;           
            reversed = reversed * 10 + rem; 
        }

        
        if (input == reversed) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is not a Palindrome.");
        }

	}

}

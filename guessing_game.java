import java.util.Scanner;
 
public class guessing_game {

	public static void main(String[] args) {
		
	


  
	
	    Scanner cin = new Scanner(System.in);
	    
	    int a = 1 + (int) (Math.random() * 99);
	    int guess = 0;

	    System.out.println("I am thinking of a number from 1 to 100"
	        + " ... guess what it is ?");

	    while (guess != a) {
	        guess = cin.nextInt();
	        
	        if (guess > a) {
	            System.out.println("lower!");
	        } else if (guess < a) {
	            System.out.println("higher!");
	        }
	    }
	    System.out.println("Congratulations. You guessed the number  "
	        );
	    cin.close();
	}}
import java.util.Random;

/**
 * @author mads
 * Program decides if a random number is odd or even
 */
public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		int value = random.nextInt(21);
		
		if(value % 2 == 0) {
			System.out.println("This is even: "+ value);
		}else {
			System.out.println("this is odd: "+ value);
		}

	}

}


public class FizzBuzz {

	 public static void main(String[] args) {
	        for (int nu = 1; nu <= 100; nu++) {
	        	if(nu%3==0 && nu%5==0) {
	        		 System.out.println("FizzBuzz");
	        	}else if(nu%3==0) {
	        		 System.out.println("Fizz");
	        	}else if (nu%5==0) {
	        		System.out.println("Buzz");
	        	}else
	            System.out.println(nu);
	        }
	    }
	 
}

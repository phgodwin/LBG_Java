package arrays;

public class App {
	
	public static void main(String[] args) {
		
//		Create an array with 10 values, populate the values and output them
		int[] nums = new int[10];
		nums[0] = 2;
		nums[1] = 4;
		nums[2] = 6;
		nums[3] = 8;
		nums[4] = 10;
		nums[5] = 12;
		nums[6] = 14;
		nums[7] = 16;
		nums[8] = 18;
		nums[9] = 20;
		
		System.out.println("Nums 1: " + nums[0]);
		System.out.println("Nums 2: " + nums[1]);
		System.out.println("Nums 3: " + nums[2]);
		System.out.println("Nums 4: " + nums[3]);
		System.out.println("Nums 5: " + nums[4]);
		System.out.println("Nums 6: " + nums[5]);
		System.out.println("Nums 7: " + nums[6]);
		System.out.println("Nums 8: " + nums[7]);
		System.out.println("Nums 9: " + nums[8]);
		System.out.println("Nums 10: " + nums[9]);
		
		
//		Create a loop that populates and int array with values, output them at each iteration
		int[] count = new int[10];
	
	for(int i = 0; i < 10; i++ ) {
		
	 count[i] = i;
	 
	 System.out.println("count: " + count[i]);
			 
	}
	
//	Then create another loop that loops through the array changing the values to 10x themselves
	
	for(int i = 0; i < 10; i++) {
		
		count[i] = i*10;
		
		System.out.println("count x 10: " + count[i]);
		
		
//		fizzbuzz output
		
	
		
		System.out.println(fizzBuzz(10));
		System.out.println(fizzBuzz(15));
		System.out.println(fizzBuzz(9));
		System.out.println(fizzBuzz(2));
		
		
		
		
		
	}
		
		
	}
// fizz buzz
	
	public static String fizzBuzz(int num) {
	
	if (num % 3 ==0 && num % 5 == 0) {
		
		return "Fizz Buzz";
			}
	
	else if (num % 3 ==0 ) {
		
		return "Fizz";
		}
	
	
	else if (num % 5 ==0 ) {
		
		return "Buzz";
		}
	
	
	else  {
		
				return String.valueOf(num);
			
	}
	}
	}


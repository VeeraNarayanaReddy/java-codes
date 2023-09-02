package coding3;

import java.util.ArrayList;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayList<Integer> number= new ArrayList<>();
	number.add(4);
	number.add(2);
	number.add(3);
	
	ArrayList<Integer> evenNumber = new ArrayList<>();
	ArrayList<Integer> oddNumber = new ArrayList<>();
	
	
	for(Integer num : number ) {
		if(num % 2 == 0) {
			evenNumber.add(num);
			
		}
		else {
			
			oddNumber.add(num);
			
		}
		System.out.println("evenNumber:"+evenNumber);
		System.out.println("oddNumber:"+oddNumber);
		}
		
		
	
	
	}
}

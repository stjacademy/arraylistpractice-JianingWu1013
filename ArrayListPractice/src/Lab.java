import java.util.ArrayList;

public class Lab {
	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(4);
		nums.add(6);
		nums.add(8);
		nums.add(10);
		nums.add(12);
		
		for(int i= 0; i < nums.size(); i++)
			nums.remove(i); 

		System.out.println(nums);
		
		
		

		
	}
}
	

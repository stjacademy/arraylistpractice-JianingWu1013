import java.util.ArrayList;

public class MiniLab {
	
	public static void main(String[] args) {
		ArrayList<Integer> ListOfFactors = getListOfFactors(36);
		System.out.println(ListOfFactors);
		keepOnlyCompositeNumbers(ListOfFactors);
		System.out.println(ListOfFactors);
	}
	
	public static ArrayList<Integer> getListOfFactors(int number)
	{
		ArrayList<Integer> ListOfFactors = new ArrayList<Integer>();
	    for (int i=2; i < number; i++) {
	    	if (number % i==0) {
	    		ListOfFactors.add(i);
	    	}
	    }
		return ListOfFactors;                                                                        	
	}
		 
	public static void keepOnlyCompositeNumbers(ArrayList<Integer> nums)
	{
		for (int i=0; i < nums.size(); i++) { 
			if (getListOfFactors(nums.get(i)).size() == 0) {
				nums.remove(i);
				i--;
			}
		}
	}

}

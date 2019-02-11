import java.util.ArrayList;

public class Notes {

	public static void main(String[] args) {
		/*
		int[] grades = new int[2];
		grades[0] = 92;
		grades[1] = 100;
		
		for (int i=0; i<grades.length; i++) 
		System.out.println(grades[i]);
		*/
		ArrayList<Integer> grades = new ArrayList<Integer>();
		grades.add(92);
		grades.add(100);
		grades.add(507);
		grades.add(83);
		
		System.out.println(grades);
		System.out.println("I removed the " + grades.remove(2));
		System.out.println(grades);
		
		grades.add(1, 99);
		System.out.println(grades);
		
		grades.set(3, 94);
		System.out.println(grades);
		
		for (int i=0; i<grades.size(); i++)
			System.out.println(grades.get(i));
		
		for (Integer num : grades) //for each num in grades
			System.out.println(num);

		for (Integer num : grades) 
		{
			grades.remove(grades.get(0));
			System.out.println(num);
		}
				
		
	}
}

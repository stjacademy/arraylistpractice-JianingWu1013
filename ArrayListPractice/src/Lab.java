import java.util.ArrayList;

public class Lab {
	public static void main(String[] args) {
		ArrayList<String> band = new ArrayList<String>();
		band.add("Lindsey");
	  	band.add("Mick");
		band.add("Stevie");
		band.add("Dave");
		band.add("Christine");
		band.add(band.remove(2));
		band.set(0,band.get(4));

		System.out.println(band);

	}
}
	

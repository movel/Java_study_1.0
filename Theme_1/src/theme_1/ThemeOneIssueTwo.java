package theme_1;

public class ThemeOneIssueTwo {

	public static void main (String[] args)
	{
		printMinMax("int");
		printMinMax("byte");
		printMinMax("char");
	}	

	public static void printMinMax(String type) {
		long minValue = 0;
		long maxValue = 0;
		long startValue;
		long endValue;
		
		if (type.equals("int")) {
			startValue = Integer.MIN_VALUE;
			endValue = Integer.MAX_VALUE;
		} else if (type.equals("byte")) {			
			startValue = Byte.MIN_VALUE;
			endValue = Byte.MAX_VALUE;
		} else if (type.equals("char")) {			
			startValue = Character.MIN_VALUE;
			endValue = Character.MAX_VALUE;
		} else {
			System.out.println("Invalid [type] argument");
			return;
		}
		
		for (long i = startValue; i <= endValue; i++) {
			if (i < minValue) minValue = i;
			if (i > maxValue) maxValue = i;			
		}
		
		System.out.println(type + ". Min: " + minValue + ", Max: " + maxValue);
	}	
}

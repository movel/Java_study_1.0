package theme_1;

public class ThemeOneIssueTwo {
	
	enum types {INT, BYTE, CHAR};
	
	public static void main (String[] args)
	{
		for (types type : types.values()) findMinMax(type);
	}	

	public static void findMinMax(types type) {
		long minType = 0;
		long maxType = 0;
		
		if (type == types.INT) {
			minType = Integer.MIN_VALUE;
			maxType = Integer.MAX_VALUE;
		} 
		if (type == types.BYTE) {			
			minType = Byte.MIN_VALUE;
			maxType = Byte.MAX_VALUE;
		}
		if (type == types.CHAR) {			
			minType = Character.MIN_VALUE;
			maxType = Character.MAX_VALUE;
		}
		
		long Min = minType;
		long Max = maxType;
		for (long i = minType; i <= maxType; i++) {
			if (i < Min) Min = i;
			if (i > Max) Max = i;
		}
		
		System.out.println(" Minimum " + type + " = " + Min);
		System.out.println(" Maximum " + type + " = " + Max);
	}
}

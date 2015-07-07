package theme_1;

public class ThemeOneIssueTwo {
	
	enum types {INT, BYTE, CHAR};
	
	public static void main (String[] args)
	{
		findMinMaxInt();
		findMinMaxByte();
		findMinMaxChar();
	}	

	public static void findMinMaxInt() {
		int count = 0;
		int max = 0;
		int min = 0;
		boolean x = true;
		while(x){
			max = count;
			count++;
			min = count;
			if (min < max) x = false;
		}
		
		System.out.println("Minimum type int = " + min);
		System.out.println("Maximum type int = " + max);
	}
	
	public static void findMinMaxByte() {
		byte count = 0;
		byte max = 0;
		byte min = 0;
		boolean x = true;
		while(x){
			max = count;
			count++;
			min = count;
			if (min < max) x = false;
		}
		
		System.out.println("Minimum type byte = " + min);
		System.out.println("Maximum type byte = " + max);
	}
	
	public static void findMinMaxChar() {
		char count = 0;
		char max = 0;
		char min = 0;
		boolean x = true;
		while(x){
			max = count;
			count++;
			min = count;
			if (min < max) x = false;
		}
		
		System.out.println("Minimum type char = " + min);
		System.out.println("Maximum type char = " + max);
	}
	
}

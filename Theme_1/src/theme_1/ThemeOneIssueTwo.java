package theme_1;

public class ThemeOneIssueTwo {
	
	public static void main (String[] args)
	{
		findMinMaxInt();
		findMinMaxByte();
		findMinMaxChar();
	}	

	public static void findMinMaxInt() {
		int count = 1;
		while(count > 0){
			count++;
		}
		System.out.println("Minimum type int = " + count);
		--count;
		System.out.println("Maximum type int = " + count);
	}
	
	public static void findMinMaxByte() {
		byte count = 1;
		while(count > 0){
			count++;
		}
		System.out.println("Minimum type byte = " + count);
		--count;
		System.out.println("Maximum type byte = " + count);
	}
	
	public static void findMinMaxChar() {
		char count = 1;
		while(count > 0){
			count++;
		}
		System.out.println("Minimum type char = " + count);
		--count;
		System.out.println("Maximum type char = " + count);
	}
	
}

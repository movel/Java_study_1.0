package Theme1;

public class ThemeOneIssueOne {

	private static int []array;
	
	public static void main(String[] args) {
		array = getArray();
		bubbleSort();
		for(int i : array)	System.out.println(i);
	}
	
	public static void bubbleSort(){
		for(int i = 0; i < array.length - 1; i++)
		    for(int j = 0; j < array.length - i - 1; j++)
		        if(array[j] > array[j + 1])
		            swap(j, j + 1);
	}
	
	public static void swap(int left, int right){
		int tmp = array[left];
		array[left] = array[right];
		array[right] = tmp;
	}
	
	public static int[] getArray(){
		
		int size=100;
		int []array = new int[size];
		int item = 0;
		for(int i=0;i<size;i++){
			item = (int)(Math.random()*100);
			array[i] = item;
		}
		return array;
	}

}

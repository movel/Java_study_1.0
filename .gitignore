public class ThemeOneIssueOne {

	private static int []a;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a = getArray();
		bubbleSort();
		for(int i : a)	System.out.println(i);
	}
	
	public static void bubbleSort(){
		for(int i = 0; i < a.length - 1; i++)
		    for(int j = 0; j < a.length - i - 1; j++)
		        if(a[j] > a[j + 1])
		            swap(j, j + 1);
	}
	
	public static void swap(int j, int j1){
		int tmp = a[j];
		a[j] = a[j1];
		a[j1] = tmp;
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

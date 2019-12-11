
public class BubbleSort {
	
	public static void sort(int[]  arr) {
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				int temp= arr[j];
				if(arr[j+1]<temp) {
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

	static int getValue() {
		return 1;
	}
	static String getHello() {
		return "Hello";
	}

}

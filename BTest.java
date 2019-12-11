import java.util.ArrayList;

public class BTest {
	public static void main(String[] args) {
		int [] myArray= { 1, 5, 3, 6,8,  7, 9};
		//
		for(int i= 0;i<myArray.length;i++ ) {
			System.out.print(myArray[i]+" ");
			//myArray[i]= myArray[i]*2;
		}
		BubbleSort.sort(myArray);
		System.out.println("\n___________\n");
		for(int i= 0;i<myArray.length;i++ ) {
			System.out.print(myArray[i]+" ");
			//myArray[i]= myArray[i]*2;
		}			
		
	}
}
class MergeSort{
	
}

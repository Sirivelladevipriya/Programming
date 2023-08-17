package array;

public class Bubblesort {

	public int[] bubblesort(int[]arr) {
		for(int i =0;i<arr.length-1;i++) {
			boolean isSwapped=false;
			int temp = 0;
			for(int j =0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j] ;
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				isSwapped=true;
			}
			if(isSwapped==false)
				break;
		}
		return arr;
		

	}

}

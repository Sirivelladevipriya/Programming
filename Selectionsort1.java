package array;

public class Selectionsort1 {

	public int[] selectionsort(int[]arr) 
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int index=i;
			int temp=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[index])
				{
				 index=j;
				}
			}
			temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
		}
		return arr;
		

	}

}

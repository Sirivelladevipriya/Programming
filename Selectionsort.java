package array;

import java.util.Scanner;

public class Selectionsort {

	public static void main(String[] args) 
	{
		
			Scanner scan = new Scanner(System.in);
			//Array Declaration
			int[] arr;
			
			//Array Creation
			System.out.println("Enter size of an array= ");
			arr = new int[scan.nextInt()];
			
			//Array Intilization
			for(int i =0;i<arr.length;i++) {
				System.out.println("Enter "+(i+1)+" Element: ");
				arr[i] = scan.nextInt();
			}
			
			System.out.println("Array Before Sorted: ");
			//Array Traversal
			for(int i =0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
			
			//Calling a constructor
			Selectionsort1 S=new Selectionsort1();
			int[] brr=S.selectionsort(arr);
			System.out.println();
			System.out.println("Array After Sorted: ");
			for(int i =0;i<brr.length;i++) {
				System.out.println(brr[i]);
			}
			scan.close();
		

	}

	
	}



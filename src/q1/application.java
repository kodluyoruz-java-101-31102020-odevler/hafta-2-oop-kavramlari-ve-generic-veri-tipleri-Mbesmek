package q1;

import java.util.Random;

public class application {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int[] arr2 = new int[25];
		Random rn = new Random();
		int a=0;
		for(int i=0; i <5; i++) {

			for(int j=0; j<5; j++) {

			arr[i][j]=a;
a++;
			} }
	
int c=0;
		for(int i=0; i <5; i++) {

			for(int j=0; j<5; j++) {

			arr2[c]=arr[i][j];
				c++;
			} }
		
		for(int i=0; i <25; i++) {
		System.out.print(arr2[i]);
		System.out.print(" ");}
	}

}

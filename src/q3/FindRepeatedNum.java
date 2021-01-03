package q3;

public class FindRepeatedNum {
	
public static <T> int[] FindRepeated(T[] list) {
		
	

int[] arr = new int[list.length];
		int c=0;
	for(int i=0;i<list.length;i++)
	{
		for(int j=i+1;j<list.length;j++)
		if(list[i]==list[j]) {
			arr[c]=(int) list[i] ;
			
			System.out.println(arr[c]);
			c++;
		}
			
		
	}
		return arr;
	}

}

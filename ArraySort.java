public class ArraySort {

	public static void main(String[] args) {
		int[] array = {30, 2, 10, 4, 6};
		int length = array.length;

		for(int i = length-1; i >0; i--)
		{
		    for(int j = 0; j < i; j++)
		    {
		        if(array[j]>array[j+1])
		        {
		            int a = array[j];
		            array[j] = array[j+1];
		            array[j+1] = a;
		        }
		    }
		}

		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}

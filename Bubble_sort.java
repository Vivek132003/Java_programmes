
public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,28,5,4,9,7,69,81};
		for(int i=0;i<array.length;i++)
		{
			for(int j=i;j<array.length;j++)
			{
				if(array[i]<array[j])
				{
					int temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				}
			}
		}
		for (int i : array) {
			System.out.print(i+" ");
		}

}
}

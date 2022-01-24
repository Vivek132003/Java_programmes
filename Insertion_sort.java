
public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,28,5,4,9,7,69,81};
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}

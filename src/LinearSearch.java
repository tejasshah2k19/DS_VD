
public class LinearSearch {

	public static void main(String[] args) {

		int arr[] = { 52, 1, 22, 33, 44, 23, 42, 12, 17, 80 };

		int key = 12;

		boolean found = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				found = true;
				break;
			}
		}

		if (found == true) {
			System.out.println("Element found");
		} else {
			System.out.println("Element not found");
		}

	}
}

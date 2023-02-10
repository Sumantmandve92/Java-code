package h_array;
//lecture 4:pairs
public class UniquePairs {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5};

		System.out.println("permutation");
		// permutation
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print("(" + a[i] + ", " + a[j] + ") ");
			}
		}
		System.out.println("permutation without repetition of elements in single pair and ((2,5)&(5,2)will considered as two pairs)");
		// permutation without repetition of elements in single pair((2,5)&(5,2)considered as two pairs)
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] != a[j]) {
					System.out.print("(" + a[i] + ", " + a[j] + ") ");
				}
			}
		}
		System.out.println("\npermutation without repetition of elements in single pair and ((2,5)&(5,2)will considered as one pair) ");
		// permutation without repetition of elements in single pair((2,5)&(5,2)considered as one pair)
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] != a[j]) {
					System.out.print("(" + a[i] + ", " + a[j] + ") ");
				}
			}
		}

	}

}

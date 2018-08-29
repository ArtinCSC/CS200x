
public class Stars {

	public static void main(String[] args) {

		int input = 7;
		int input1 = 1;
		int spas = input;

		for (int i = 1; i <= input; i++) {
			for (int l = spas; l > 0; l--) {
				System.out.print(" ");
			}
			for (int s = input1; s > 0; s--) {
				System.out.print("* ");
			}
			System.out.println();
			spas--;
			input1++;
			if (i == input) {
				int spas1 = 2;
				int input2 = input - 1;
				for (int t = 2; t <= input; t++) {
					for (int d = 0; d < spas1; d++) {
						System.out.print(" ");
					}
					for (int h = input2; h > 0; h--) {
						System.out.print("* ");
					}
					System.out.println();
					spas1++;
					input2--;
				}
			}
		}
	}
}

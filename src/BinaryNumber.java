import java.util.Scanner;

public class BinaryNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("give me a base 10 number");
		System.out.println("I am going to convert it to a binary number ");
		int decimal = input.nextInt();
		
		int base = 2;
		
		int Output = decimal / base;
		int RemOfOutput = decimal % base;
		
		int Output1 = Output / base;
		int RemOfOutput1 = Output % base;
		
		int Output2 = Output1 / base;
		int RemOfOutput2 = Output1 % base;
		
		int Output3 = Output2 / base;
		int RemOfOutput3 = Output2 % base;
		
		int Output4 = Output3 / base;
		int RemOfOutput4 = Output3 % base ;
		//int myBinaryInt = RemOfOutput + RemOfOutput1 + RemOfOutput2 + RemOfOutput3 + RemOfOutput4 ;
		String myBinaryStr = String.valueOf(RemOfOutput + RemOfOutput1 + RemOfOutput2 + RemOfOutput3 + RemOfOutput4);
		
		//String binary = Integer.toBinaryString();
		 


		
		//System.out.println(Output);
		//System.out.println(RemOfOutput);
		System.out.println(myBinary);

		
	}

	private static String parseInt(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}

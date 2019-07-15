import java.util.Scanner;

class ReversedNumber{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ReversedNumber rn = new ReversedNumber();
		System.out.print("Enter an interger number");
		rn.printResult(sc.nextInt());
	}

	public void printResult(int num){
		String number = Integer.toString(num);
		String reversedNum="";
		for (int i = 0; i < number.length() ;i++ ) {
			reversedNum = reversedNum+number.charAt(number.length()-(i+1));
		}

		System.out.print("Reverse Number is: " +(String)reversedNum );
	}
}
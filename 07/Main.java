import java.util.Scanner;
import  java.util.Arrays;
class Main {

	static int intInv (int str) {
		int l = Integer.toString(str).length();
		if (l<= 1)
			return str;
		else{
			int last = (str % 10) * (int)Math.pow(10,l-1);
			return last + intInv(Integer.parseInt((Integer.toString(str).substring(0,l-1))));
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int str = s.nextInt();
		System.out.println(intInv(str));
	}
}

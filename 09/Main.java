import java.util.Scanner;
import  java.util.Arrays;
class Main {

	static String intt(int n){
		return Integer.toString(n);
	}

	static String binary (int num) {
		int res = num % 2;
		if (num==2)
			return intt(num/2)+res;
		if (num==1)
			return ""+res;
		else{
			return binary(num/2) + res;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println(binary(num));
	}
}

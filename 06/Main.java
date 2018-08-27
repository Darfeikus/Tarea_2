import java.util.Scanner;
import  java.util.Arrays;
class Main {

	static String strInv (String str) {
		if (str.length()<= 1)
			return str;
		return (String.valueOf(str.charAt(str.length()-1))+strInv(str.substring(0,str.length()-1)));
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(strInv(str));
	}
}

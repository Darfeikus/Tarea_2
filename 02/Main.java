import java.util.Scanner;

class Main{

	static	int charCheck(String s, char c){
		if (s.length()==0)
			return 0;
		if(s.charAt(0)==c)
			return 1 + charCheck(s.substring(1),c);
		else
			return 0 + charCheck(s.substring(1),c);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char c = s.nextLine().charAt(0);
		String st = s.nextLine();
		System.out.println(charCheck(st,c));
	}
}
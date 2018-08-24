import java.util.Scanner;

class Main{

	static	String strCheck(String s1, String s2){
		if(s1.length()!=s2.length())
			return "Not equal";
		else if(s1.length()==0)
			return "They're equal";
		else if (s1.charAt(0)==s2.charAt(0))
			return strCheck(s1.substring(1),s2.substring(1));
		return "Not equal";
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		String s2 = s.nextLine();
		System.out.println(strCheck(s1,s2));
	}
}
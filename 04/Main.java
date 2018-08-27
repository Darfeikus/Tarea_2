import java.util.Scanner;
import  java.util.Arrays;
class Main{

	static int sum(int[] i){
		if (i.length==1)
			return i[0];
		else
			return i[0]+sum(Arrays.copyOfRange(i,1,i.length));
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int times = Integer.parseInt(s.nextLine());
		int[] nums = new int[times];
		for (int i = 0;i<times;i++)
			nums[i]=s.nextInt();
		System.out.println(sum(nums));
	}
}	
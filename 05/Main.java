import java.util.Scanner;
import  java.util.Arrays;
class Main{

	static int[] arrInv(int[] i){
		int[] retArr = new int[i.length];
		if (i.length==1)
			return i;
		if (i.length==2){
			retArr[0]=i[1];
			retArr[1]=i[0];
			return retArr;
		}
		else{
			int[] temp = new int[retArr.length-1];
			temp=arrInv(Arrays.copyOfRange(i,1,i.length));
			retArr[retArr.length-1]=i[0];
			for (int j=0;j<temp.length;j++)
				retArr[j]=temp[j];
			return retArr;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int times = Integer.parseInt(s.nextLine());
		int[] nums = new int[times];
		for (int i = 0;i<times;i++)
			nums[i]=s.nextInt();
		for (int i : arrInv(nums))
			System.out.print(i + ", ");
		System.out.println();
	}
}	
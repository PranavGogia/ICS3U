import java.util.Scanner;

public class dmpg16b6 {

	public static void main(String[] args) {
		double total=0;
		Scanner scn=new Scanner(System.in);
		//int operations=scn.nextInt();
		
		//for (int i=0;i<operations;i++)
		//{
			String blah=scn.nextLine();
			for(int j=0;j!=blah.length();j++)
			{
				if (blah.charAt(j)=='1');
				{
					if (blah.charAt(j)!='0'){
					total=total+Math.pow(-2, j);
					//System.out.println(total);
					}
				}
				
			}
			System.out.println(total);
		//}
	}

}

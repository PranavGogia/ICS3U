import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class dmpg16b2 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("0.00");
		int counter=0;
		int kill=0;
		int d;
		double blah;
		int c;
		int b;

		String[] tokens = in.readLine().split(" ");
		int a = Integer.parseInt(tokens[0]);
		for (int i=a;i!=0;i--)
		{
			String[] show = in.readLine().split(" ");
			b = Integer.parseInt(show[0]);
			c = Integer.parseInt(show[1]);
			String[] tell = in.readLine().split(" ");
			for (int z=b-1;z!=0;z--)
			{

				d = Integer.parseInt(tell[kill]);
				if (d>c)
				{
					counter++;
				}
				//System.out.println(tell[kill]);
				kill++;
			}

			blah=b-counter;
			//System.out.println(blah);	
			blah=Math.sqrt(blah);
			//System.out.println(blah);	
			blah=blah*100;
			//System.out.println(blah);	
			kill=0;
			counter=0;
			b=0;
			c=0;
			System.out.println("Bob wins $"+df.format(blah)+" at IOI!");
			blah=0;

		}

	}

}

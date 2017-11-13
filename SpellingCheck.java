import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SpellingCheck {

	public static void main(String[] args) {
		ArrayList<String>a=new ArrayList<String>();
		a.add("This");
		a.add("is");
		a.add("my");
		a.add("copy");
		int c=1;
		while(c==1)
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter a string: ");
			String s=scan.nextLine();
			int i,l,flag;
			String s1[]=s.split(" ");
			for(int j=0;j<s1.length;j++)
			{
				l=s1[j].length();
				i=0;
				flag=0;
				while(i<l/2)
				{
					if(!String.valueOf(a.get(j).charAt(i)).equalsIgnoreCase(String.valueOf(s1[j].charAt(i))))
					{
						flag=1;
						break;
					}
					i++;
				}
				if(flag==0)
					s1[j]=a.get(j);
				else
					a.add(s1[j]);
			}
			Iterator itr=a.iterator();
			System.out.print("Updated dictionary: ");
			while(itr.hasNext())
				System.out.print(itr.next()+", ");
			for(String str:s1)
				System.out.print(str+" ");
			System.out.println();
			System.out.println("Do you want to continue(0/1)? ");
			c=scan.nextInt();
		}
	}

}
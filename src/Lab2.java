import java.util.Scanner;

public class Lab2
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		//int num1;
		String ans1, ans2;

		System.out.print("Are you hungry? (Enter YES or NO): ");
		//num1 = input.nextInt();
		ans1 = input.next();

		if (ans1.equals("NO"))
			System.out.println("OK. Bye!");
		else
		{
			System.out.print("Get in line!\nLet's get some lunch!\nAre you thirsty? (Enter YES or NO): ");
			ans2 = input.next();
			if (ans2.equals("YES"))
				System.out.print("OK. Let's get some Coke!\nNow eat!\n");
			else
				System.out.print("OK. Let's get some water.\nNow eat!\n");
			System.out.print("Return your tray!\nSee you again!");
		}
	}

}

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		int x;
		int y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for x ");
		x = sc.nextInt();
		System.out.println("Enter value for y ");
		y = sc.nextInt();
		System.out.println("Starting point : ("+x+" , "+y+")");
		String step = ">>><<<~>>>~^^^";
		int j=0;
		for(int i=0;i<step.length();i++)
		{
			if(step.charAt(i) == '~')
			{
				if(i == step.length()-1)
				{
					break;
				}
				
				do
				{
				i++;
				if(step.charAt(i) == '>')
					x--;
			
				if(step.charAt(i) == '<')
					x++;
		
				if(step.charAt(i) == '^')
					y++;
			
				if(step.charAt(i) == 'v')
					y--;
				} while(step.charAt(i) != '~');
				i++;
			}
			
			if(step.charAt(i) == '>')
				x++;
		
			if(step.charAt(i) == '<')
				x--;
		
			if(step.charAt(i) == '^')
				y--;
		
			if(step.charAt(i) == 'v')
				y++;
		}
		System.out.println();
		System.out.println("End point : ("+x+" , "+y+")");

	}

}

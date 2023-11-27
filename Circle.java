package eat;

import java.util.Scanner;

public class Circle {
	public static void main(String args[]) {
	double phi =3.14;
	
	
	Scanner scanner =new Scanner(System.in);
			System.out.print("Enter radius of the circle:  ");
	int radius= scanner.nextInt();
	
	double area = phi * radius * radius;
	
	{
		
		System.out.print(area);
	}

}
}
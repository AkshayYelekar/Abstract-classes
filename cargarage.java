package abstractWale;

import java.util.Scanner;

public class cargarage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		car[] c=new car[5];
		System.out.println("1:Add wagonor  2:Add suzuki  3:Display 4 :start race");



		int choice = 0;
		int index = 0;
		do {
			System.out.println("Enter Choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if(index<5)
				{
					System.out.println("enter mno,color,noac");
					c[index]=new Wagonor(sc.nextInt(),sc.next(),sc.nextInt());
					System.out.println("wagonor added");
					index++;
				}
			break;
			case 2:
				if(index<5)
				{
					System.out.println("enter mno,color,rooftop");
					c[index]=new suzuki(sc.nextInt(),sc.next(),sc.nextBoolean());
					System.out.println("suzuki added");
					index++;
				}
				break;
			case 3:
				for(car cr:c)
				{
					if(cr!=null)
					{
						System.out.println(cr);
					}
					
					
				}
				break;
			case 4:
					System.out.println("thamks");
			
			}
			}while(choice!=4);
		

	}

}

package abstractWale;

import java.util.Scanner;

class cartest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Wagonor w=new Wagonor();
		System.out.println(w);
		
		Wagonor w1=new Wagonor(127,"Red",5);
		System.out.println(w1);
		
		suzuki s=new suzuki();
		System.out.println(s);
		
		suzuki s1=new suzuki(128,"white",true);
		System.out.println(s1);
		
		
	}

}

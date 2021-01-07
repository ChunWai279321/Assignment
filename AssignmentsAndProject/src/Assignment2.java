import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		//personalbackground();
		productprovide();
		

	}
	
	public static void personalbackground() {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter you name: ");
		String personal=in.next();
		System.out.print("Contact number(personal): ");
		String no=in.next();
		System.out.print("E-mail address: ");
		String mail=in.next();
		System.out.print("Home address:  ");
		String home=in.next();
		System.out.println();
	}

	public static void productprovide() {
		Scanner in=new Scanner(System.in);
		double sum;
		System.out.println("3 types of product we provided: ");
		System.out.println("Sneakers (1)\t\t: RM30\nHiking boots (2)\t: RM50\nBasketball Shoes (3)\t: RM70\n");
		System.out.println("10% discount is given if you buy more than 5");
		System.out.println("20% discount is given if you buy more than 10\n");
		System.out.print("What product are you prefer (Enter the code, 0 to end): ");
		int shoe=in.nextInt();
		for (int i =0; i<shoe;i++) {
		if (shoe==1) {
			System.out.print("How many pair of shoe you want to order: ");
			double q0=in.nextInt();
				if (q0<=5) {
					sum=(q0*30);
					System.out.printf("Dear customer you need to pay: RM%.2f\n",(sum));
				} else
				if (q0>5 && q0<=10) {
					sum=(q0*30*0.9);
					System.out.printf("Dear customer you need to pay: RM%.2f\n",(sum));
				} else
				if (q0>10) {
					sum=(q0*30*0.8);
					System.out.printf("Dear customer you need to pay: RM%.2f\n",(sum));
				} System.out.println();
			}
			
		if (shoe==2) {
			System.out.print("How many pair of shoe you want to order: ");
			double q0=in.nextInt();
				if (q0<=5) {
					sum=(q0*50);
					System.out.printf("Dear customer you need to pay: RM%.2f\n",(sum));
				} else
				if (q0>5 && q0<=10) {
					sum=(q0*50*0.9);
					System.out.printf("Dear customer you need to pay: RM%.2f\n",(sum));
				} else
				if (q0>10) {
					sum=(q0*50*0.8);
					System.out.printf("Dear customer you need to pay: RM%.2f\n",(sum));
				} System.out.println();
			} 
		
		if (shoe==3) {
			System.out.print("How many pair of shoe you want to order: ");
			double q0=in.nextInt();
				if (q0<=5) {
					 sum=(q0*70);
					System.out.printf("Dear customer you need to pay: RM%.2f\n",(sum));
				} else
				if (q0>5 && q0<=10) {
					sum=(q0*70*0.9);
					System.out.printf("Dear customer you need to pay: RM%.2f\n",(sum));
				} else
				if (q0>10) {
					sum=(q0*70*0.8);
					System.out.printf("Dear customer you need to pay: RM%.2f\n",(sum));
				} System.out.println();
			}  
				
		if (shoe==0) {
				
			} 
		
		if (shoe!=0 && shoe!=1 && shoe!=2 && shoe!=3) {
			System.out.println("Not valid");
			System.out.println();
		} 
		
			System.out.print("What product are you prefer (Enter the code, 0 to end): ");
			shoe=in.nextInt();
			
		} 
	}
}

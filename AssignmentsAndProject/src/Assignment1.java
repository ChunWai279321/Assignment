import java.util.*;
public class Assignment1 {

	public static void main(String[] args) {
		personalbackground();
		productprovide();
		PriceAndCharge();

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
		System.out.print("What product are you prefer: ");
		String product=in.next();
		System.out.println();
	}
	
	public static void PriceAndCharge(){
		Scanner in=new Scanner(System.in);
		System.out.println("The price of a pair of shoes: RM10");
		System.out.println("10% discount is given if you buy more than 10");
		System.out.println("20% discount is given if you buy more than 20");
		System.out.println("30% discount is given if you buy more than 30");
		System.out.println();
		System.out.print("How many pair of shoe you want to order: ");
		double q0=in.nextInt();
		if (q0<=10) {
			double sum0=(q0*10);
			System.out.printf("Dear customer you need to pay: RM%.2f\n",(sum0));
		} else
		if (q0>10 && q0<=20) {
			double sum1=(q0*10*0.9);
			System.out.printf("Dear customer you need to pay: RM%.2f\n",(sum1));
		} else
		if (q0>20 && q0<=30) {
			double sum2=(q0*10*0.8);
			System.out.printf("Dear customer you need to pay: RM%.2f\n",(sum2));
		} else
		if (q0>30) {
			double sum3=(q0*10*0.7);
			System.out.printf("Dear customer you need to pay: RM%.2f\n",(sum3));
		}
	}
}


import java.util.*;
/*
  controller
  	operator
  	if/else
  	loops
 */
class conditionalconstructs {
	public static void main(String[] args) {
		// Scanner
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter an amount");
		double amount= sc.nextDouble();
		System.out.println("Enter the promo code");
		int promocode= sc.nextInt();
		
		sc.close();// releases the memory resources
		
		System.out.println("Amount ="+amount);
		System.out.println("promo code ="+promocode);
		sc.close();
		
		int jumbo=101;// flat 50% off for the items worth 200 or more
		int ZomHello=201;//flat 60% off for items worth 159 or more upto 120
		
		String message = amount>=159?"you will get discount":"No discount is available";
		System.out.println(message);
		double discount=0;
		
		boolean code= (( promocode==jumbo||promocode==ZomHello))?true:false;
		if(code)
		{
			double percent=((promocode==jumbo)&&(amount>=200)?0.5:0.6);
			if(percent==0.5)
			{
				discount=amount*0.5;
				amount-=discount;
				System.out.println("Hurrah You are getting Flat "+discount+"off on your order");
			}
			else if((amount>=159&&amount<200)&&(percent==0.5))
			{
				System.out.println("Oops promo codejumbo is only valid on orders above 200");
			}
			else
			{
				discount=amount*0.6;
				if (discount>120)
				{
					discount=120;
				}
				amount-=discount;
				System.out.println("Hurrah You are getting Flat "+discount+"off on your order");
			}
		}
		else if(amount>=159&&code==false)
		{
			System.out.println("invalid promo code");
			int valid=promocode/100==1?101:201;
			System.out.println("Valid promocode is "+ valid);
		}
		System.out.println("please pay: "+amount);
	}
		
		// assignment : implement ternary operators for above
		// 				when promo code is invalid say correct promo code
		//				implement a use case i.e. Book a Cab by taking ola/uber as a case study

}
	
	
	//switch case
	// cases cannot be variable
	// no duplicates in cases
	// we can use "final" variable for cases

		



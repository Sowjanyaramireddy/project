import java.util.Scanner;

 class SimpleCalculator {
	//to declare the variables
	//private int a;
	//private int b;
	//to declare the methods
	//void set(int a,int b)
	//{
		//this.a=a;
		//this.b=b;
	//}
    //void findCal()
    //{
    	//System.out.println("Addition of two numbers is:::"+(a+b));
    	//System.out.println("Substraction of two numbers:::"+(a-b));
    	//System.out.println("Multiplication of two numbers:::"+(a*b));
    	//System.out.println("Division of two numbers:::"+(a/b));
    //}
	public static void main(String[] args) 
	{
		//declaring the variables
		double num1,num2,result;
		char opt;
		//creating object for class scanner
		Scanner sc=new Scanner(System.in);
		//display a message to user what to enter
		System.out.println("Enter first number::");
		num1=sc.nextDouble();
		System.out.println("Enter second number::");
		num2=sc.nextDouble();
		//take operation from user
		System.out.println("Enter operation (+,-,*,/):::");
		opt=sc.next().charAt(0);
		
		//switch case
		switch(opt)
		{
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		case '%':
			result=num1%num2;
			break;
		default:
			System.out.println("Invalid operator");
			return;
		}
        //print the result
		System.out.println(num1+" "+opt+" "+num2+" : "+result);
	}

}

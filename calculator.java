import java.util.Scanner;
public class calculator {
	static Scanner choice = new Scanner(System.in);

	public static void main(String args[]){
		display();
		int choice1 = choice.nextInt();
		switchCase(choice1);
	}
		
		
		
	
	//main display
	public static void display(){
		System.out.println("Enter An Calculation To Perform");
		System.out.println("1. Press 1 for simple operation");
		System.out.println("2. Press 2 for interest calculation");
		System.out.println("3. Press 3 for Fibonacci Calculation");
		System.out.println("4. Press 4 for permutation and comination");
		
		
	}

//display if selected simple operation
	public static void simpleOperation(){
		clear();
		System.out.println("1.Press 1 for addition");
		System.out.println("2.Press 2 for subtraction");
		System.out.println("3.Press 3 for multiplication");
		System.out.println("4.Press 4 for division");
		System.out.println("5.Press 5 for remainder");
		int choice2 = choice.nextInt();
		System.out.println("Enter The First Number");
		int choice11 = choice.nextInt();
		System.out.println("Enter The First Number");
		int choice12 = choice.nextInt();
		switch(choice2){
						case 1:
							int sum = choice11 + choice12;
							System.out.println("The Sum Of Two Numbers Is " + sum);
							break;
						case 2:
							int difference = choice11 - choice12;
							System.out.println("The Difference Of Two Numbers Is " + difference);
							break;
						case 3:
							double divide = choice11 / choice12;
							System.out.println("The division of two number yields " + divide);
							break;
						case 4:
							int multiply = choice11 * choice12;
							System.out.println("The multiplication of two numbers yields " + multiply);
							break;
						case 5:
							int remain = choice11 % choice12;
							System.out.println("The remainder of two numbers is " + remain);
							break;
						default:
							System.out.println("Enter a valid choice");
							
		}
	}
	
	//display if selected interest operation
	public static void interestOperation(){
		clear();
		System.out.println("1.Press 1 for simple interest");
		System.out.println("2.Press 2 for compound interest");
		int choice3 = choice.nextInt();
		System.out.println("Enter the principal amount");
		int choice21 = choice.nextInt();
		System.out.println("Enter the time in years");
		double choice22 = choice.nextDouble();
		System.out.println("Enter the rate per annum");
		double choice23 = choice.nextDouble();
		switch(choice3){
						case 1:
							double sinterest = (choice21 * choice22 * choice23) / 100 ;
							System.out.println("The Simple interest is " + sinterest);
							break;
						case 2:
							double cinterest = Math.pow(choice21 * (1 + choice23),choice22);
							System.out.println("The Compound interest is " + cinterest);
							break;
						default:
							System.out.println("Enter a valid choice");
		}
	}
	
	//display if selected permutation and combination
public static void permutationOperation(){
	clear();
	System.out.println("1.Press 1 for permutation");
	System.out.println("2.Press 2 for combination");
	
	int choice4 = choice.nextInt();
	System.out.println("Enter the first number");
	double choice41 = choice.nextDouble();
	System.out.println("Enter the second number");
	double choice42 = choice.nextDouble();

	switch(choice4){
					case 1:
						double per = factorial(choice41)/factorial(choice41-choice42);
						System.out.println("the perutation of two numbers is "+ per);
						break;
					case 2:
						double com = factorial(choice41)/(factorial(choice42)*factorial(choice41-choice42));
						System.out.println("The combination of two numbers "+ com);
						break;
					
					default:
						System.out.println("enter a valid option");
						
	}
}

public static void clear(){
	for(int clear = 0; clear < 1000; clear++)
	  {
	     System.out.println(" ") ;
	  }
}


public static void fibonacciCalculation(){
	 System.out.print("Enter number upto which Fibonacci series to print: ");
	    int number = new Scanner(System.in).nextInt();
	    System.out.println("\n\nFibonacci series upto " + number +" numbers : ");
	    //printing Fibonacci series upto number
	    for(int i=1; i<=number; i++){
	        System.out.print(fibonacciRecusion(i) +" ");
	    }
	} 

	

public static void switchCase(int choice1){
	switch(choice1){
				case 1:
					simpleOperation();
					break;
				case 2:
					interestOperation();
					break;
				case 3:
					fibonacciCalculation();
					break;
				case 4:
					permutationOperation();
					break;
				default:
					System.out.println("Enter a valid option");
	}
}


//Fibonacci number using recursion.
public static int fibonacciRecusion(int number){
    if(number == 1 || number == 2){
        return 1;
    }

    return fibonacciRecusion(number-1) + fibonacciRecusion(number-2); 
}

public static int factorial(double d){
	
	int c, fact = 1;
       for ( c = 1 ; c <= d ; c++ )
          fact = fact*c;
       return fact;
}
	
}

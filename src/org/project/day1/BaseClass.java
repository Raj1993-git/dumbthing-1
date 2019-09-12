package org.project.day1;

public class BaseClass {
	


	
	  //method 1
	public static int EvenNumberTotal(int s)
	{ int sum=0; 
	System.out.println("total number of even number");
	
	for (int numb = 0; numb <=100; numb++) 
	{ if (numb%2==0) {
		sum=sum+numb;}}
	 System.out.println(sum);
	  return sum; }
	//method 2
	public static int oddNumberTotal(int m)
	{ int sum=0; 
	System.out.println("Total of odd number");
	
	for (int numb = 0; numb <=10; numb++) 
	{ if (numb%2==1) {
		sum=sum+numb;}}
	 System.out.println(sum);
	  return sum; }
//method 3
public static int Fibunoci(int g) {
	int a=0;
	int b=1;
	System.out.println("Begining of fibunoci numbers");
	System.out.println(a);
	System.out.println(b);
	int can=0;
	 for (int i = 2; i <20; i++) {
		 can=a+b;
		a=b;
		b=can;
		 System.out.println(can); }
	return can;}


public static int  Armstrong() {
int numb=153;
int temp=numb;
	int rem=0;
	int sum=0;
	while (numb!=0) {
		rem=numb%10;
		rem=rem*rem*rem;
		sum=sum+rem;
		numb=numb/10;
	
	}
	System.out.println(sum);
		
		  if (sum==temp) { System.out.println("Given number is armstrong number"); }
		  else { System.out.println("not a armstrong number");}
		  
		 
	
	return sum;
}
	
}
	




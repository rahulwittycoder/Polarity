import java.util.Scanner;  
public class SpyNumberExample1   
{  
public static void main(String args[])  
{   
int num, product=1, sum=0, lastdigit;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number to check: " );  
num=sc.nextInt();  
while(num>0)  
{  
  //hello
//finds the last digit of the number      
lastdigit=num%10;  
//adds last digit to the variable sum  
sum=sum+lastdigit;  
//calculates the product  
product=product*lastdigit;  
//removes the last digit from the given number  
num=num/10;  
}  
//compares the sum and product  
if(sum==product)  
//prints if the above condition returns true  
System.out.println("The given number is a spy number.");  
else  
//prints else part if the above condition returns false  
System.out.println("The given number is not a spy number.");  
}  
}  
System.out.println("Code Optimized");

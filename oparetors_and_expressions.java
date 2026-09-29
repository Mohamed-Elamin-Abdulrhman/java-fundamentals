import java.util.Scanner;
public class oparetors_and_expressions{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("enter the first integer");
int num1 = input.nextInt();
System.out.println("enter the seconed integer");
int num2 = input.nextInt();
int sum = num1 + num2;
int difference = num1 - num2;
int roduct = num1 * num2;
int intdiv = num1 / num2;
int reminder = num1 % num2;
double realDiv = (double) num1 / num2;
System.out.println("----arthimatic results----");
System.out.println("addition(+) :" +sum);
System.out.println("substraction(-) :" +difference);
System.out.println("multiplication(*) :" +roduct);
System.out.println("integer division :" +intdiv);
System.out.println("modulus(%) :" +reminder);
System.out.println("----incresment/decresment----");
int count = num1;
System.out.println("original count :" + count);
System.out.println("post-increment (count++):" + (count++));
System.out.println("after post incremet :" + count);
System.out.println("pre-increment (++count):" + (++count));
}}


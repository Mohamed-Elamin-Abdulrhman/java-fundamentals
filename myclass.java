import java.util.Scanner;
public class myclass{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("enter your full name");
String name = input.nextLine();
System.out.println("enter your age");
int age = input.nextInt();
System.out.println("enter your gpa");
double gpa = input.nextDouble();
System.out.println("-----student details-----");
System.out.println("name:"+name);
System.out.println("age:"+age);
System.out.println("gpa:"+gpa);
}}
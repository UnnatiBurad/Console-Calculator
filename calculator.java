import java.util.*;
public class calculator
{
int a,b,c;
Scanner sc=new Scanner(System.in);
void add()
{
System.out.println("Enter first number");
int a=sc.nextInt();
System.out.println("Enter second number");
int b=sc.nextInt();
int c=a+b;
System.out.println("Sum of two numbers="+c);
}

void sub()
{
System.out.println("Enter first number");
int a=sc.nextInt();
System.out.println("Enter second number");
int b=sc.nextInt();
int c=a-b;
System.out.println("substraction  of two numbers="+c);
}

void multiply()
{
System.out.println("Enter first number");
int a=sc.nextInt();
System.out.println("Enter second number");
int b=sc.nextInt();
int c=a*b;
System.out.println("multiplication of two numbers="+c);
}

void div()
{
System.out.println("Enter first number");
int a=sc.nextInt();
System.out.println("Enter second number");
int b=sc.nextInt();
if(a==0 || b==0)
{
System.out.println("divide by zero not possible");
}
else
{
int c=a/b;
System.out.println("division of two numbers="+c);
}
}





public static void main(String[] args)
{

calculator c=new calculator();
c.add();
c.sub();
c.multiply();
c.div();
}
}



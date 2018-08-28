import java.util.Scanner;
class complex
{
 int real,img;
}
class main
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
complex x=new complex();
complex y=new complex();
int a,b;
x.real=s.nextInt();
x.img=s.nextInt();
y.real=s.nextInt();
y.img=s.nextInt();
a=x.real+x.img;
b=y.real+y.img;
System.out.print(a+"+"+""+b+"i");
}
}

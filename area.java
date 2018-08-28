import java.util.Scanner;
class rectangle
{
int w,h;
rectangle(int a,int b)
{
  w=a;
  h=b;
}
}
class main
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int area;
rectangle r=new rectangle(a,b);
area=r.w*r.h;
System.out.println(area);
}
}
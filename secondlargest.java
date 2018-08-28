import java.util.Scanner;
class secondlargest
{
 public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int i,j,n,temp;;
int a[]= new int[10];
for(i=0;i<10;i++)
{
  a[i]=s.nextInt();
}
for(i=0;i<10;i++)
{
for(j=i+1;j<10;j++)
{
if(a[i]>a[j])
{ temp=a[i];
  a[i]=a[j];
   a[j]=temp;
}
}
}
System.out.println("second largest no. is:"+a[8]);
}
}
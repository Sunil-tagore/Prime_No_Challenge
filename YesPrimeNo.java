import java.util.*;
public class YesPrimeNo
{
   YesPrimeNo(int n)
   {
  int count=0;
  for(int i=1;i<=n;i++)
 {
  if(n%i==0)
   {
     count++;
  }
}

  if(count==2)
   System.out.println(n+" "+"is a prime no");
 else
    System.out.println(n+" "+"is not a prime no");  
}
 public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Please insert any number");
  int n=sc.nextInt();
   YesPrimeNo yp=new YesPrimeNo(n);
}
}
  

  

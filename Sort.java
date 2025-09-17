import java.io.*;
class sort
{
  public static void main(String args[])
  {
    int a[]=new int[20];
    int j;temp i;
    for(i=0;i<args.length;i++)
    {
      a[i]=Integer.ParseInt(args[i]);
    }
    for(i=0;i<args.length;i++)
    {
    for(j=0;j<args.length-i-1;j++)
     {
       if(a[j]>a[j+1])
       {
         temp=a{j];
         a[j]=a[j+1];
         a[j+1]=temp;
       }
     }
}
 System.out.println("Sorted array elementare:");
 for(i=0;i<args.length;i++);
 {
   System.out.println(a[i]+"\t");
      }
    }
}
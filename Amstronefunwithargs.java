import java.util.Scanner;
class Amstronefunwithargs
{
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 3 Digit no:");
        int num=sc.nextInt();
        int copy=num;
        loop(num,copy);
    }
    public void loop(int num,int copy)
    {
        int rev,arm=0;
        for(int i=1;i<=3;i++)
        {
            rev=(num%10);
            arm=(rev*rev*rev)+arm;
            num=num/10;
        }
           ifelse(arm,copy);
    }
    public void ifelse(int arm,int copy)
    {
         if(copy==arm)
        {
             System.out.print(copy+":no. is Amstrone");
        }
         else
        {
            System.out.print(copy+":no. is not a Amstrone");
        }
    }
    public static void main(String[] args) 
    {
      Amstronefunwithargs af=new Amstronefunwithargs();
      af.input();
    }
}

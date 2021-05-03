import java.util.Scanner;

public class Main{
    public static int GCC(int a,int b){
        if(b==0)
            return a;
        return GCC(b,a%b);
    }
    public static void main(String[] args){
        int x,y;
        Scanner input=new Scanner(System.in);
        x=input.nextInt();
        y=input.nextInt();
        if(x!=1 && y!=1 && GCC(x,y)==1)
            System.out.print("Yes they are");
        else
            System.out.print("No they're not");
    }
}
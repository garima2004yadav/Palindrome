import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        int no,n,rem,s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        no=sc.nextInt();
        n=no;
        while(n!=0)
        {
            rem=n%10;
            s=s*10+rem;
            n=n/10;
        }
        if(s==no)
        System.out.println("Palindrome no");
        else
        System.out.println("Not Palindrome no");
        sc.close();
    }
    
}

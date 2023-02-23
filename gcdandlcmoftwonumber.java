//gcd and lcm of a two numbers
//this program is to find gcd of a two numbers
//gdc and hcf both are same
//formula is n1*n2=gcd*lcm remember this for future use
import java.util.*;
public class Main{
    public static void main(String[] args){
        try(Scanner scn=new Scanner(System.in)){
            int rem=0;
          
            int n1=scn.nextInt();
            int n2=scn.nextInt();
            int on1=n1; //original n1 and orignal n2
            int on2=n2;
            while(n1%n2!=0){
                rem=n1%n2;
                n1=n2;
                n2=rem;
            }
            int gcd=n2;
            int lcm=(on1*on2)/gcd;
            System.out.println(gcd);
            System.out.println(lcm);
        }
    }
}

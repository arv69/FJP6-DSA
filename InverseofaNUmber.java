
//actually it is not inverse of a number
//replace the digit with position
//51243 output should be 52134
//formula==position*10^digit-1
import java.util.*;
public class Main{
    public static void main(String[] args){
        try(Scanner scn=new Scanner(System.in)){
            int num=scn.nextInt();
            int sum=0;
            int pos=1;
            while(num!=0){
                int rem=num%10;
                int value=(pos*(int)Math.pow(10,rem-1));
                  sum=sum+value;
                pos++;
                   num=num/10; 
            }
            System.out.print(sum);
        }
    }
}

//count digit of a number
import java.util.*;

public class Main{

    public static void main(String[] args){
       try(Scanner scn=new Scanner(System.in)){ int num=scn.nextInt();
        int count=0;
        while(num!=0){
          num=  num/10;
            count++;
        }
        System.out.print(count);
    }
}
}
       

import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int count=1;
      int copyofN=n;
      while(copyofN>9){
        copyofN=copyofN/10;
        count=count*10;
      }
      while(count!=0){
        int digit=n/count;
        System.out.println(digit);
        n=n%count;
        count=count/10;

      }
     }
    }

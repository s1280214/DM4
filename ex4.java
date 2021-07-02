import java.util.Random;
import java.lang.Math;
import java.util.Scanner; 

public class Main {
      public static void main(String[] args) {
        
        //名前を聞くパート
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your name");

        String num = scanner.nextLine();

        System.out.println("Hello "+num);
        
        //ダイスロール
System.out.println("Rolling the dice...");
  
          int goal;
  
        int val1 = (int) (Math.random() * 6)+1;
        System.out.println("Die 1:"+val1);

        int val2 = (int) (Math.random() * 6)+1;
        System.out.println("Die 2:"+val2);
        goal = val1 + val2;

        System.out.println("Total value : "+goal);
         if(goal >=7) {
            System.out.println(num+" won");
        }

        else{
             System.out.println(num+" lose");
        }

}
}

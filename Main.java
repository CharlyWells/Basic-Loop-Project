import java.util.ArrayList;
import java.util.Scanner;
public class Main {
   public static void main(String[] args){
       //write your code here
       int length;
       Scanner scanner = new Scanner(System.in);
       System.out.println("How many integers are you entering:");
       length = scanner.nextInt();

       ArrayList<Integer> cup = new ArrayList<>(length);
       for(int c= 0; c<length; c++){
           System.out.println("Enter Integer No:" + (c+1));
           int number = scanner.nextInt();
           //run 1: number = 3
           //run 2: number = 4
           //run 3: number = 2
           //run 4: number = 8

           if(cup.isEmpty()){//run 1: true
               cup.add(number); //{3}
           }
           else{
               //run 2: {3}
               //run 3: {3,4}
               //run 4: {2,3,4}

               int currentIndex = -1;
               for(int i=0; i<c; i++){
                   if(number >=cup.get(i)){
                       currentIndex = i; //currentIndex = 0
                   }
               }
               try{
                   cup.add(currentIndex + 1,number);
                   //{3,4}
                   //{2,3,4}
                   //{2,3,4,8}
               }catch (Exception ex){
                   cup.add(number);
               }


           }

       }

                System.out.println("The integers you entered are: ");
                System.out.println(cup);
   }
}

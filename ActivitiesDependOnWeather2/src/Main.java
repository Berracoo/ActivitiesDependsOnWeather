import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the degree of your environment : ");
        int degree = input.nextInt();
        System.out.println();
        input.close();
      int x,y;
      x = degree < 5 ? 1 : degree > 5 && degree < 15 ? 2 : degree > 15 && degree < 25 ? 3 : 4;
      switch(x){
          case 1:
              System.out.println("The weather is perfect for skiing !");
              break;
          case 2:
              System.out.println("How about going to a cinema ?");
              break;
          case 3:
              System.out.println("A picnic would be great !");
              break;
          case 4:
              System.out.println("You must be exhausted from heat, maybe swimming will help ?");
              break;
      }

    }
}
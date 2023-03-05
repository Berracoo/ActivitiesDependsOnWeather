import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the degree of your environment : ");
        int degree = input.nextInt();
        System.out.println();
        if(degree < 5){
            System.out.println("The weather is perfect for skiing !");
        }else if(degree > 5 && degree < 25){
              if( 15 >= degree){
                System.out.println("How about going to a cinema ?");
              
            }if(degree >= 10){
                System.out.println("A picnic would be great !);
                
            }

        }else{
            System.out.println("You must be exhausted from heat, maybe swimming will help?");
        }
    }
}

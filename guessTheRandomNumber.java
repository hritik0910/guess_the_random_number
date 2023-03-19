import java.util.Scanner;
public class guessTheRandomNumber {
    public static void main(String[] args) {
        int number = (int)((Math.random()*100));
        int guess = 0;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("Guess the number:-");
            guess = sc.nextInt();
            if (guess == number){
                System.out.println("you are right :)");
                break;
            }
            else if (guess< number){
                System.out.println("the number you have guessed smaller than number");

            }
            else{
                System.out.println("The number you have guessed is larger than number");
            }

        }while ( guess>= 0 );
            System.out.println("the number was ");
            System.out.println(number);

    }
}

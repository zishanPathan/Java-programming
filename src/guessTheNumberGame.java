import java.util.Random;
import java.util.Scanner;

class game {
    int number;
    int inputNumber;
    int noOfGuess = 0;

    public void setNoOfGuess(int noOfGuess) {
        this.noOfGuess = noOfGuess;
    }

    public int getNoOfGuess() {
        return noOfGuess;
    }

     game(){
           Random rand = new Random();
           this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("guess the no : ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNum(){
        noOfGuess++;
        if (inputNumber==number){
            System.out.printf("yess you guessed it right %d is the number\n you guessed it in %d attampts",number,noOfGuess);
            return true;
        } else if (inputNumber<number) {
            System.out.println("number is too low...");
        }else if (inputNumber>number) {
            System.out.println("number is too high...");
        }
        return false;
    }
}
public class guessTheNumberGame {
    public static void main(String[] args) {
        game g = new game();
        boolean b = false;
        while (b) {
           g.takeUserInput();
           g.isCorrectNum();
       }
    }
}

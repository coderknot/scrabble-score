import java.io.Console;

public class App{
  public static void main(String[] args){
    Console myConsole = System.console();

    System.out.println("Enter a letter:");
    String letterInput = myConsole.readLine();
    Scrabble game = new Scrabble();

    System.out.println("Your score is: " + game.calculateScore(letterInput));
  }
}

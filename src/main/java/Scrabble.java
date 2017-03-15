import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Scrabble {

  public Integer calculateScore(String word) {
    Integer returnValue = 0;

    String[] wordArray = word.split("");

    List score1List = Arrays.asList("a", "e", "i", "o", "u", "l", "n", "r", "s", "t");
    List score2List = Arrays.asList("d", "g");
    List score3List = Arrays.asList("b","c","m","p");
    List score4List = Arrays.asList("f","h","v","w","y");
    List score5List = Arrays.asList("k");
    List score8List = Arrays.asList("j", "x");
    List score10List = Arrays.asList("q", "z");

    for (String letter : wordArray){
      if(score1List.contains(letter)) {
        returnValue += 1;
      } else if(score2List.contains(letter)) {
        returnValue += 2;
      } else if(score3List.contains(letter)) {
        returnValue += 3;
      } else if(score4List.contains(letter)) {
        returnValue += 4;
      } else if(score5List.contains(letter)){
        returnValue += 5;
      } else if(score8List.contains(letter)){
        returnValue += 8;
      } else if(score10List.contains(letter)){
        returnValue += 10;
      } else {
        returnValue += 0;
      }
    }

    return returnValue;
  }
}

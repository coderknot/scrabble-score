import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {

  @Test
  public void calculateScore_returnsScoreForSingleLetter_1() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("a"));
  }

  @Test
  public void calculateScore_returnsScoreForMultipleLetters_1() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("a"));
    assertEquals(expected, testScrabble.calculateScore("e"));
    assertEquals(expected, testScrabble.calculateScore("i"));
    assertEquals(expected, testScrabble.calculateScore("o"));
    assertEquals(expected, testScrabble.calculateScore("u"));
    assertEquals(expected, testScrabble.calculateScore("l"));
    assertEquals(expected, testScrabble.calculateScore("n"));
    assertEquals(expected, testScrabble.calculateScore("r"));
    assertEquals(expected, testScrabble.calculateScore("s"));
    assertEquals(expected, testScrabble.calculateScore("t"));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_2() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 2;
    assertEquals(expected, testScrabble.calculateScore("d"));
  }

  @Test
  public void calculateScore_returnsScoreForMultipleLetters_2() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 2;
    assertEquals(expected, testScrabble.calculateScore("d"));
    assertEquals(expected, testScrabble.calculateScore("g"));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_3() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 3;
    assertEquals(expected, testScrabble.calculateScore("b"));
  }

  @Test
  public void calculateScore_returnsScoreForMultipleLetter_3() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 3;
    assertEquals(expected, testScrabble.calculateScore("b"));
    assertEquals(expected, testScrabble.calculateScore("c"));
    assertEquals(expected, testScrabble.calculateScore("m"));
    assertEquals(expected, testScrabble.calculateScore("p"));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_4() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 4;
    assertEquals(expected, testScrabble.calculateScore("f"));
  }

  @Test
  public void calculateScore_returnsScoreForMultipleLetter_4() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 4;
    assertEquals(expected, testScrabble.calculateScore("f"));
    assertEquals(expected, testScrabble.calculateScore("h"));
    assertEquals(expected, testScrabble.calculateScore("v"));
    assertEquals(expected, testScrabble.calculateScore("w"));
    assertEquals(expected, testScrabble.calculateScore("y"));
  }
  @Test
  public void calculateScore_returnsScoreForMultipleLetter_10() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 10;
    assertEquals(expected, testScrabble.calculateScore("q"));
    assertEquals(expected, testScrabble.calculateScore("z"));
  }
}

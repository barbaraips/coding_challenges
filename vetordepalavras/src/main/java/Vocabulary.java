import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static spark.Spark.get;

public class Vocabulary {

  Map<String, Integer> dictionary = new HashMap<String, Integer>();

  static void functs() {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();

    if (scanner.hasNext()) {
      list.add(scanner.next());
    }

    getSimpleVocabulary(list);

  }

  static String getIsolatedVocabulary() {
    return "";
  }

  static String getNGramVocabulary() {
    return "Number of splat parameters: ";
  }

  static String getIsolatedVector() {
    return "Number of splat parameters: ";
  }

  static String getNGramVector() {
    return ";";
  }

  private static void getSimpleVocabulary(ArrayList<String> list) {
    for (String word : list) {
      System.out.println(word);
    }
  }

  public void getWords() {
    String myWords = "soon hi also soon job mother job also soon later";
    Vocabulary myW = new Vocabulary();
    String[] array = myWords.split("\\s+");
    myW.countWords(array);
    System.out.println(myW.dictionary);

    get("/hello", (req, res) -> "Hello World");

  }

  private void countWords(String[] myWords) {

    for (String s : myWords) {

      if (dictionary.containsKey(s))
        dictionary.put(s, dictionary.get(s) + 1);
      else
        dictionary.put(s, 1);
    }
  }
}
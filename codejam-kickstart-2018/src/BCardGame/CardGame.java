package BCardGame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardGame {
  private List<Case> cases;

  public CardGame(List<Case> cases) {
    this.cases = cases;
  }

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("C:\\Users\\Ashly Lau\\Downloads\\B-large.in");
    Scanner sc = new Scanner(new BufferedReader(new FileReader(file)));

    CardGame cardGame = new CardGame(new ArrayList<>());
    int numTestCases = sc.nextInt();

    for (int i = 0; i < numTestCases; i++) {
      int n = sc.nextInt();
      int k = sc.nextInt();

      Case newCase = new Case(n, k);
      for (int j = 0; j < n; j++) {
        newCase.addToList(sc.nextInt());
      }
      //System.out.println(newCase.toString());
      cardGame.cases.add(newCase);
      System.out.println("Case #" + (i+1) + ": " + newCase.numCardsLeft());

    }

  }
}

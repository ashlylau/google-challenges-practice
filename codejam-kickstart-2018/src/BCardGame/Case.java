package BCardGame;

import java.util.ArrayList;
import java.util.List;

public class Case {
  private int n;
  private int k;
  private List<Integer> listCards;

  public Case(int n, int k) {
    this.n = n;
    this.k = k;
    this.listCards = new ArrayList<>();
  }

  public void addToList(int card) {
    this.listCards.add(card);
  }

  @Override
  public String toString() {
    return listCards.toString();
  }

  public int numCardsLeft() {
    int numCards;
    int newNumCards;
    do {
      numCards = listCards.size();
      //System.out.println(numCards);
      for (int i = 0; i < listCards.size() - 2; i++) {
        int a = listCards.get(i);
        int b = listCards.get(i + 1);
        int c = listCards.get(i + 2);

        if ((c - b == b - a) && (c - b == k)) {
          listCards.remove(i);
          listCards.remove(i);
          listCards.remove(i);
        }
      }
      newNumCards = listCards.size();
      //System.out.println(newNumCards);
    } while (newNumCards < numCards);

    return newNumCards;
  }
}

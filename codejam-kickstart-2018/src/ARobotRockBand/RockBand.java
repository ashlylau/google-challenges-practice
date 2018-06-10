package ARobotRockBand;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RockBand {

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("C:\\Users\\Ashly Lau\\Downloads\\A-large.in");
    Scanner sc = new Scanner(new BufferedReader(new FileReader(file)));

    int numTestCases = sc.nextInt();

    for (int i = 0; i < numTestCases; i++) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      Case newCase = new Case(n, k);

      for (int j = 0; j < 4; j++) {
        List<Robot> robotList = new ArrayList<>();
        for (int l = 0; l < n; l++) {
          robotList.add(new Robot(sc.nextInt()));
        }
        //System.out.println(robotList);
        newCase.getSpotList().add(robotList);
      }
      //System.out.println(newCase.getSpotList());

      System.out.println("Case #" + (i+1) + ": " + newCase.getPermutations());
    }

  }
}

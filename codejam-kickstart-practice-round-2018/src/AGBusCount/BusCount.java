package AGBusCount;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusCount {
  private int numCases;
  private List<Case> cases;


  public BusCount(int numCases, List<Case> cases) {
    this.numCases = numCases;
    this.cases = cases;
  }

  public List<Case> getCases() {
    return cases;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("numCases: " + numCases + ", ");
    for (int i = 0; i < numCases; i++) {
      sb.append("Case " + (i+1) + ": " + cases.get(i).toString() + ", ");
    }
    sb.deleteCharAt(sb.length()-1);
    return sb.toString();
  }

  public static void main(String[] args) throws IOException {


    //implement reading of file (blank space)
    //File file = new File("C:\\Users\\Ashly Lau\\Desktop\\google-challenges-practice\\codejam-kickstart-practice-round-2018\\src\\AGBusCount\\test.in");
    File file = new File("C:\\Users\\Ashly Lau\\Downloads\\A-small-practice.in");
    //BufferedReader br = new BufferedReader(new FileReader(file));

//    String st;
//    while ((st = br.readLine()) != null) {
//      if (st.isEmpty()) {
//        System.out.println("emptyyyy");
//      } else {
//        System.out.println(st);
//      }
//    }


    Scanner in = new Scanner(new BufferedReader(new FileReader(file)));
    int numCases = in.nextInt();
    int OGnumCases = numCases;
    //System.out.println("numCases: " + numCases);
    List<Case> cases = new ArrayList<>();

    while (numCases > 0) {
      int numBuses = in.nextInt();
      //System.out.println("numBuses: " + numBuses);
      List<Integer> citiesCovered = new ArrayList<>();
      for (int i = 0; i < numBuses * 2; i++) {
        citiesCovered.add(in.nextInt());
      }
      //System.out.println(citiesCovered.toString());

      List<Integer> citiesToCount = new ArrayList<>();

      String st;
      in.nextLine();
      while ((st = in.nextLine()) != null) {
        if (st.isEmpty()) {
          break;
        } else {
          citiesToCount.add(Integer.parseInt(st));
        }
      }
      Case newCase = new Case(numBuses, citiesCovered, citiesToCount);
      cases.add(newCase);
      numCases--;
    }

    BusCount busCount = new BusCount(OGnumCases, cases);

    for (int i = 0; i < OGnumCases; i++) {
      System.out.print("Case #" + (i+1) + ": ");
      busCount.getCases().get(i).printCounts();
      //System.out.println();
    }

    //System.out.println(busCount.toString());

  }





  //input:

//  2 - no. of tests
//  4 - no. of buses
//  15 25 30 25 45 50 10 20
//  2
//  15
//  25
//
//  10 - no. of buses
//  10 15 5 12 40 55 1 10 25 35 45 50 20 28 27 35 15 40 4 5
//  3
//  5
//  10
//  27
}

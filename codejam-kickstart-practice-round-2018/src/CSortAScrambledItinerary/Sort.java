package CSortAScrambledItinerary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sort {
  private int numCases;
  private List<SortCase> casesList;


  public Sort(int numCases, List<SortCase> casesList) {
    this.numCases = numCases;
    this.casesList = casesList;
  }

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("C:\\Users\\Ashly Lau\\Desktop\\google-challenges-practice\\codejam-kickstart-practice-round-2018\\src\\CSortAScrambledItinerary\\test.in");
    Scanner sc = new Scanner(new BufferedReader(new FileReader(file)));

    int numCases = sc.nextInt();
    System.out.println("numCases: " + numCases);
    List<SortCase> casesList = new ArrayList<>();

    for (int i = 0; i < numCases; i++) {
      int numFlights = sc.nextInt();
      System.out.println("numFlights: " + numFlights);
      List<Flight> flights = new ArrayList<>();

      sc.nextLine();
      for (int j = 0; j < numFlights; j++) {
        String source = sc.nextLine();
        String dest = sc.nextLine();
        Flight flight = new Flight(source, dest);
        System.out.println(flight.toString());
        flights.add(flight);
      }

      casesList.add(new SortCase(numFlights, flights));

    }

    Sort sort = new Sort(numCases, casesList);
    for (SortCase sortCase : casesList) {
      sortCase.sortFlights();
    }



  }

}

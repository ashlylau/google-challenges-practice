import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException{

      File file = new File("C:\\Users\\Ashly Lau\\Downloads\\A-small-practice.in");
      BufferedReader br = new BufferedReader(new FileReader(file));

      String st;
      while ((st = br.readLine()) != null) {
        if (st.isEmpty()) {
          System.out.println("emptyyyy");
        } else {
          System.out.println(st);
        }
      }
//      Scanner in = new Scanner(System.in);
//      System.out.println("enter a number");
//      System.out.println(in.nextInt());
    }
}

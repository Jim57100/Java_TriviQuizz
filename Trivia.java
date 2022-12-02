import java.util.Scanner;
import java.util.Locale;

public class Trivia {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
    int score = 0;

    System.out.println("1. Which country held the 2016 Summer Olympics?");
    System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
    String answer1 = scan.nextLine();
    if(answer1.equals("c")) score = score + 5;
    System.out.println("\n2. Which planet is the hottest?");
    System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
    String answer2 = scan.nextLine();
    if(answer2.equals("a")) score = score + 5;
    System.out.println("\n3. What is the rarest blood type?");
    System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-negative\n");
    String answer3 = scan.nextLine();
    if(answer3.equals("d")) score = score + 5;
    System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
    System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
    String answer4 = scan.nextLine();
    if(answer4.equals("a") || answer4.equals("b")) score = score + 5;
    
    scan.close();
    
    if (score >= 15) {
      System.out.println("\n score : " + score + "/20");
      System.out.println("Wow, you know your stuff!");
    } else if(score < 15 && score >=5) {
      System.out.println("\n score : " + score + "/20");
      System.out.println("Not bad!");
    } else {
      System.out.println("\n score : " + score + "/20");
      System.out.println("better luck next time!");
    }

  }
}
//code
import java.util.Scanner;

public static void main (String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("Would you like to see a dog or a cat? Enter in lowercase.");
    String catOdog = scan.next();
    if(catOdog == "cat"){
        System.out.println("CAT ASCII ART HERE");
    } else {
        System.out.println("DOG ASCII ART HERE");
    }
}
import java.util.Scanner;
public class AnimalPicker{
public static void main (String args[]){
    Scanner scan = new Scanner(System.in);
    String catOdog;
    
    do{
        System.out.println("Would you like to see a dog or a cat?");
         catOdog = scan.nextLine().toLowerCase();

        if(!catOdog.equals("cat") && !catOdog.equals("dog")){
            System.out.println("Invalid response entered. Please enter either 'cat' or 'dog'" );
        }
    } while (!catOdog.equals("cat") && !catOdog.equals("dog"));
    if(catOdog.equals("cat")){
        System.out.println("CAT ASCII ART HERE");
    } else{
        System.out.println("DOG ASCII ART HERE");
}
}
}

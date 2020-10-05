import java.util.Scanner;

public class gameB{

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.println("Who created Linux?\n1.A Penguin\n2.Linus Torvalds\n3.LinusTechTips");
sc.nextLine();

System.out.println("Who owns Github?\n1.Linus Torvalds\n2.Markus Persson\n3.Microsoft");
sc.nextLine();



try {
    System.out.print("Input first answer:");
    sc.nextLine();
    
} catch (Exception e) {
    System.out.println("You did somthing wrong");
    sc.nextLine();

}
String LQ = sc.nextLine();

switch (LQ) {
case "A Pengui":
        System.out.println("Maby who knows.. You wrong!!");
        
        break; 

case "Linus Torvalds":
    System.out.println("Congrats you were right");
    break;

  case "LinusTechTips":
    System.out.println("Sorry you answere is incorrect!");
    default:
    System.out.println("Sorry you input is invalid!");
        break;
}
String GQ = sc.nextLine();

switch (GQ) {
 case "Linus Torvalds":
        System.out.println("He have might have been!");
        break; 

case "Markus Persson":
    System.out.println("Sorry you answere is incorrect!");
    break;

case "Microsoft":
    System.out.println("Congrats you were right!");
    default:
    System.out.println("Sorry you input is invalid!");
        break;
}


sc.close();
}
}
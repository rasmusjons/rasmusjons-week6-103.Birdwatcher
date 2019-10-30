
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        //alla fåglar ligger i en array som ligger i klassen Catalog. 
        // för att ett "inlägg" i array ska innehålla flera värden (likt bil1: röd, volvo, 2009. bil2: blå saab, 2008)
        // skapades klassen bird. I bird skapas sedan objekt(rätt ord?) instance of klassen, men värdena namn, latinskt namn och anal observationer. 
        
        

        Catalog catalog = new Catalog();
       Scanner reader = new Scanner(System.in);
       

        boolean runProgam = true;

        while (runProgam) {
            System.out.println("?");
            String menu = stringInput(reader);

            if (menu.equals("Add")) {
                addBird(catalog, reader);

            }

            if (menu.equals("Observation")) {
                observed();
                String observation = stringInput(reader);
                catalog.addObservation(observation);

            }
            if (menu.equals("Statistics")) {

                catalog.statistics();

            }

            if (menu.equals("Show")) {
                System.out.println("What?");
                String show = stringInput(reader);
                System.out.println(catalog.showOneBird(show));

            }

            if (menu.equals("Quit")) {
                runProgam = false;
            }

        }
    }

    private static String stringInput(Scanner reader ) {
      
        String stringInput = reader.nextLine();
        return stringInput;
    }

    private static int intInput(Scanner reader) {
       
        int intInput = reader.nextInt();
        return intInput;
    }

    public static void addBird(Catalog catalog, Scanner reader) {
        String name;
        String latinName;
        System.out.print("Name: ");
        name = stringInput(reader);
        System.out.print("Latin Name: ");
        latinName = stringInput(reader);
        Bird bird = new Bird(name, latinName);
        catalog.add(bird);

    }
    
    
    public static void observed(){
        System.out.println("What was observed:?");

    }
    
    

}

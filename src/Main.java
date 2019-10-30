
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Catalog catalog = new Catalog();
        Scanner reader = new Scanner(System.in);

        boolean runProgam = true;

        while (runProgam) {
            System.out.println("?");
            String menu = reader.nextLine();

            if (menu.equals("Add")) {
                addBird(catalog);

            }

            if (menu.equals("Observation")) {
                observed();
                String observation = stringInput();
                catalog.addObservation(observation);

            }
            if (menu.equals("Statistics")) {

                catalog.statistics();

            }

            if (menu.equals("Show")) {
                System.out.println("What?");
                String show = stringInput();
                System.out.println(catalog.showOneBird(show));

            }

            if (menu.equals("Quit")) {
                runProgam = false;
            }

        }
    }

    public static String stringInput() {
        Scanner reader = new Scanner(System.in);
        String stringInput = reader.nextLine();
        return stringInput;
    }

    public static int intInput() {
        Scanner reader = new Scanner(System.in);
        int intInput = reader.nextInt();
        return intInput;
    }

    public static void addBird(Catalog catalog) {
        String name;
        String latinName;
        System.out.print("Name: ");
        name = stringInput();
        System.out.print("Latin Name: ");
        latinName = stringInput();
        Bird bird = new Bird(name, latinName);
        catalog.add(bird);

    }
    
    
    public static void observed(){
        System.out.println("What was observed:?");

    }
    
    

}

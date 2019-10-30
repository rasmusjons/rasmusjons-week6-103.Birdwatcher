
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rasmus
 */
public class Catalog {

    private ArrayList<Bird> birdarray = new ArrayList<Bird>();
    String statistics;
    String showBird;
    String allBirds;

    public void add(Bird newBird) {
        this.birdarray.add(newBird);
    }

    public void statistics() {

        for (Bird bird : this.birdarray) {
            System.out.println(bird.getName() + "(" + bird.getLatinName() + "): " + bird.getObservations() + " observations");
        }

    }

    public String showOneBird(String name) {
        String noBird = "Is not a bird!";

        if (this.birdarray.isEmpty()) {
            return noBird;

        } else {
            for (Bird bird : this.birdarray) {
                if (bird.getName().equals(name)) {
                    showBird = bird.getName() + "(" + bird.getLatinName() + "): " + bird.getObservations() + " observations";
                }
            }
        }
        return showBird;
    }

    public String showOneBird() {
        for (Bird bird : this.birdarray) {
            showBird = bird.getName() + "(" + bird.getLatinName() + "): " + bird.getObservations() + " observations";
        }

        return showBird;

    }

    public void addObservation(String name) {

        for (Bird bird : this.birdarray) {
            if (this.birdarray.isEmpty()) {
                System.out.println("not a name");

            } else if (bird.getName().equals(name)) {
                bird.incrementObservation();
            }
        }
    }

}


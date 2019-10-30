
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
public class Bird {

    private String name;
    private String latinName;
    private int observations;

    public Bird() {

    }

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    public String toString() {
        return this.name + " " + this.latinName + " " + this.observations;

    }

    public String getName() {
        return this.name;

    }

    public String getLatinName() {
        return this.latinName;

    }

    public String getObservations() {
        return this.observations + "";

    }

    public void incrementObservation() {
        this.observations++;

    }

}

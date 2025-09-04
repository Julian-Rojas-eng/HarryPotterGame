/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package character;

import character.*;
import spell.*;

public class Launcher {
    public static void main(String[] args) {
        Character harry = new HarryPotter();
        Character ron = new RonWeasley();
        Character hermione = new HermioneGranger();

        System.out.println(harry.describe());
        System.out.println(ron.describe());
        System.out.println(hermione.describe());

        harry.castSpell("dementor");
        ron.castSpell("enemy");
        hermione.castSpell("feather");

        // Cambio de hechizo en tiempo de ejecución
        hermione.setSpell(new OculusReparo());
        System.out.println(hermione.describe());
        hermione.castSpell("Harry's Glasses");
    }
}

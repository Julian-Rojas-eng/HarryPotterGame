/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package character;


import spell.Spell;

public class Character {
    private String name;
    private Spell spell;

    public Character(String name, Spell spell) {
        this.name = name;
        this.spell = spell;
    }

    public String getName() {
        return name;
    }

    public void setSpell(Spell spell) {
        if (spell == null) throw new IllegalArgumentException("The spell can't be null");
        this.spell = spell;
    }

    public void castSpell(String objective) {
        if (spell == null) {
            System.out.println(name + " doesn't have an spell asigned.");
            return;
        }
        spell.cast(this, objective);
    }

    public String describe() {
        return "I'm " + name + " and my current spell is " + (spell != null ? spell.getName() : "none");
    }
}

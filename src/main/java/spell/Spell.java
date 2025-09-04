/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spell;



import character.Character;

public interface Spell {
    void cast(Character origin, String objective); 
    String getName();
}

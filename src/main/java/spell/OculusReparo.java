/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spell;

import character.Character;

public class OculusReparo implements Spell {
    @Override
    public void cast(Character origin, String objective) {
        System.out.println(origin.getName() + " uses Oculus Reparo to fix:  " + objective);
    }

    @Override
    public String getName() {
        return "Oculus Reparo";
    }
}


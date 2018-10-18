/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piratenogui;
import java.util.Scanner;
/**
 *
 * @author misha
 */
public class PirateNoGui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner
        Scanner keyedInput = new Scanner(System.in);
        
        //The different inputs you can have
        String answer1; //a or b
        String answer2; //a-a or a-b
        String answer3; //a-b-a or a-b-b
        String answer4; //a-b-a-a- or a-b-a-b
        String answer5; //a-b-a-b-a or a-b-a-b-b
        String answer6; //a-b-a-b-b-a or a-b-b-a-b-b-b
        String answer7; //b-a or b-b
        String answer8; //b-b-a or b-b-b
        String answer9; //b-b-a-a or b-b-a-b
        
        
        
        
        
        //First prompt
        System.out.println("You are a pirate heading out to sea in search of treasure. You and your crew spot a storm up ahead. Do you a) sail into it or b) turn around?");
        
        answer1 = keyedInput.nextLine();
        
        //a
        if (answer1.equals("a")) {    
            System.out.println("You sail towards the storm, and see two islands on the horizon. One is closer to the storm, but the other has very rough water and jagged rockls around it. Do you travel to a) The island near the storm or b) the island surrounded by rocks?");
            
            answer2 = keyedInput.nextLine();
            
                //a-a
                if (answer2.equals("a")) {
                    System.out.println("Bad idea: you are not as skilled a sailor as you thought, and your boat sinks. Some of your crewmates manage to swim to land, but you do not.");
                }
                //a-b
                else if (answer2.equals("b")) {
                    System.out.println("As you head deeper into the storm, lightning hits your mast and it falls clean off. Do you a) stay with the ship or b) jump and swim for land?");
                    
                    answer3 = keyedInput.nextLine();
                    
                    //a-b-a
                    if (answer3.equals("a")) {
                        System.out.println("You stay on the ship, and the waves push it towards shore. Eventually, the ship hits a sandy beach and stays there. Do you a) stay on the boat and wait for the storm to pass or b) go onto shore to seek shelter?");
                        
                        answer4 = keyedInput.nextLine();
                        
                        //a-b-a-a
                        if (answer4.equals("a")) {
                            System.out.println("You eventually fall asleep despite the storm, and when you wake the waves have pushed your boat back out to sea. You never find the islands again.");
                        }
                        
                        //a-b-a-b
                        else if (answer4.equals("b")) {
                            System.out.println("You head onto the shore to find shelter. Do you a) go into the nearby forest to find a dry spot or b) enter a cave near the beach?");
                            
                            answer5 = keyedInput.nextLine();
                            
                            //a-b-a-b-a
                            if (answer5.equals("a")){
                                System.out.println("You and your crew head into the forest to look for shelter from the storm. You hear russtling in the leaves behind you and turn around, you are greeted by a number of cougars. Your crew scatters and tries to run, but you don't make it.");
                            }
                            
                            //a-b-a-b-b
                            else if (answer5.equals("b")) {
                                System.out.println("You and your crew decide to head into the cave. You walk in and appreciate the dryness, but also notice that the cave goes much deeper than you originally thought. Do you a) explore deeper into the cave or b) wait in the entrance of the cave ?");
                                
                                answer6 = keyedInput.nextLine();
                                
                                //a-b-a-b-b-a
                                if (answer6.equals("a")) {
                                    System.out.println("You decide to head deeper into the cave. You find yourself in a maze of tunnels, and you have no idea where your crewmates have gone. You wander the tunnels for what seems like an eternity, but you never find your way out. Not a good way to die.");
                                }
                                
                                //a-b-a-b-b-b
                                else if (answer6.equals("b")) {
                                    System.out.println("While you wait in the mouth of the cave, you notice a spot ion the rock ground that looks more like gravel. You push some of the gravel aside, and find a chest. When you open it, gold doubloons spill out. Jackpot!");
                                }
                                
                                else{
                                System.out.println("Invalid input");
                                }
                            }
                            
                        else{
                            System.out.println("Invalid input");
                        }
                        
                    }
                    }
                    //a-b-b
                    else if (answer3.equals("b")) {
                        System.out.println("You jump out and try to swim to land, but the water is too rough for your weak swimming abilities. You drown, and your surviving crewmates find your body on shore the next day.");
                    }
                    
                    else{
                    System.out.println("Invalid input");
                    }
                
                
                
                                            }
               else{
                    System.out.println("Invalid input");
                }
        }        
        //b
        else if (answer1.equals("b")) {    
            System.out.println("You turn away from the storm, but after a few minutes you see a british navy cruiser headed towards you. Do you a) Make a sharp right turn to avoid the cruiser or b) Continue heading towards the ship?");
            
            answer7 = keyedInput.nextLine();
            
            //b-a
            if (answer7.equals("a")) {
                System.out.println("You turn sharply, but this only makes the navy ship suspicious. The ship turns to follow you, and has no problem catching up to your boat. You and yout crewmates are arrested. Your pirating days are over. ");
            }
            
            //b-b
            else if (answer7.equals("b")) {
                System.out.println("You contine as you were, and the navy ship passes by you around a few hundred meters away. You wipe the sweat off of your brow. Do you a) continue looking for treasure or b) head back to shore, in case of more navy ships.");
                
                answer8 = keyedInput.nextLine();
                
                //b-b-a
                if (answer8.equals("a")) {
                    System.out.println("There is nothing but open water as far as the eye can see. Do you a) let the wind push your boat out to sea or b) Travel straight in the direction that you are already pointing?");
                
                    answer9 = keyedInput.nextLine();
                    
                    //b-b-a-a
                    if (answer9.equals("a")) {
                        System.out.println("After a few hours, the wind pushes you back in the direction of a port. You take this as a sign, and head to the port. When on the dock, you notice something shining in the shallow water.\n You jump in to grab it, it is a single gold doubloon. Not the treasure you were looking for, but treasure nonetheless. You buy four rounds of beer for yourself and your crew with it. Life is good.");
                    }
                    
                    //b-b-a-b
                    else if (answer9.equals("b")){
                        System.out.println("After three full days of heading in a straight line without a single interesting thing happening, you decide to head back to shore. \n As it turns out, you have no idea where that is. You spend your last days floating around in the middle of the atlantic.");
                    }
                }
                
                //b-b-b
                else if (answer8.equals("b")) {
                    System.out.println("You decide to cut your losses, and head back to shore. Treasure-less but alive, you and your crew head to a tavern to refresh yourselves and enjoy life as a pirate.");
                }
                
                else {
                    System.out.println("Invalid input");
        }   
            }
            
            else {
                System.out.println("Invalid input");
        }
        }
        
        else {
            System.out.println("Invalid input");
        }
    
    
}

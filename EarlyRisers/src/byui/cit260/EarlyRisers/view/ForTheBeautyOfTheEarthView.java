/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.view;

/**
 *
 * @author Cody
 */
public class ForTheBeautyOfTheEarthView extends View{

    @Override
    public String[] getInputs() {
        String[] inputs = new String[10];
        String selection = this.getInput(
        "\n\n+-------------------------------------------+" +
        "\n|                                           |" +
        "\n|     The wonders of God's creations        |" +
        "\n|     are all around you. Would you         |" +
        "\n|     like to appreciate them?              |" +
        "\n|                                           |" +
        "\n+-------------------------------------------+\n" +
        "\n1: Observe the sky in contemplation." +
        "\n2: Climb up a mountain and ponder." +
        "\n3: Explore the forest in observation." +
        "\n4: Search through a cave in speculation." +
        "\n5: Gaze upon the night sky in awe." +
        "\n6: EXIT from marveling over God's creations."
        );
        
        inputs[0] = selection;
        return inputs;
    }

    @Override
    public boolean doAction(String[] input) {
        String choice = input[0];
        switch(choice){
            case "1":
                System.out.println(
                    "\nAs you observe the sky, you see the billowing white clouds above you."
                    + "\nYou reflect upon the words of Job extolling the greatness of God,"
                    + "\n\"He bindeth up the waters in his thick clouds; and the cloud is not rent under them.\""
                    + "\nYou marvel how God created such marvelous things such as clouds that can float high in the sky."
                    + "\nBeing able to change to a variety of shapes, sometimes staying in place, sometimes moving fast or slow."
                    + "\nNever falling down from the sky. Meanwhile, capable of generating lightning, rain, and shade."       
                    + "\nTruly, God's creations are magnificient!"
                );
                break;
            case "2": 
                System.out.println(
                    "\nAs you finish climbing up a mountain, you gaze around. You can see for a vast distance in all directions."
                    + "\nLooking down below you toss a little pebble and watch as it falls far down below."
                    + "\nA startled bird nearby takes flight from his perch. A single feather escapes from the body of the bird"
                    + "\nand slowly starts wisping down before a gust of wind catches it and sends it careening high into the air and out of view."
                    + "\nYou reflect upon the words of Amos speaking forth the words of God:"
                    + "\n\"For, lo, he that formeth the mountains, and createth the wind, and declareth unto man what is his thought,"
                    + "\nthat maketh the morning darkness, and treadeth upon the high places of the earth, The Lord, The God of hosts, is his name.\""
                    + "\nYou marvel how God is able to have some things be able to fly, some things float and buffet along, and for others to plummet to the earth."
                    + "\nYou feel the wind and ponder upon how its invisible hands seem to rush at everything. Often yielding to the physical but sometimes"
                    + "\ngrasping upon and moving around its prey in a dance of victory. Sometimes with a roar, sometimes with a faint whisper."
                    + "\nTruly, God's creations are magnificient!"
                );
                break;
            case "3":
                System.out.println(
                    "\nAs you explore the forest around you. You note the many varied plants and animals around you in all their wondrous detail."
                    + "\nYou reflect upon the words of Job regarding how the Lord governs all things:"
                    + "\n\"But ask now the beasts, and they shall teach thee; and the fowls of the air, and they shall tell thee:"
                    + "\nOr speak to the earth, and it shall teach thee: and the fishes of the sea shall declare unto thee."
                    + "\nWho knoweth not in all these that the hand of the LORD hath wrought this?"
                    + "\nIn whose hand is the soul of every living thing, and the breath of all mankind.\""
                    + "\nYou marvel how God is the author of so much intricate, living beauty."
                    + "\nHow they all bring forth seed of its own kind even as God had told Father Abraham long ago."
                    + "\nTruly, God's creations are magnificient!"
                );
                break;
            case "4":
                System.out.println(
                    "\nAs you wander deeper and deeper into the cave all light from outside is extinguished."
                    + "\nYet, by the light of your torch you can see the magnicient shapes created by water and earth."
                    + "\nMagnificient spiraled creations portruded all around. Little drops of water occasionally rolling down from their points."
                    + "\nIt seemed that the cave had created its own spears to ward off strangers who might come to disturb its beauty."
                    + "\nWith only the light of your torch providing guidance for your steps and lighting for viewing the mysterious formations around you."
                    + "\nYou reflect upon the words of a psalm extolling praise for the Lord:"
                    + "\n\"O come, let us sing unto the LORD: let us make a joyful noise to the rock of our salvation."
                    + "\nLet us come before his presence with thanksgiving, and make a joyful noise unto him with psalms."
                    + "\nFor the LORD is a great God, and a great King above all gods. In his hand are the deep places of the earth: the strength of the hills is his also."
                    + "\nThe sea is his, and he made it: and his hands formed the dry land."
                    + "\nO come, let us worship and bow down: let us kneel before the LORD our maker.\""
                    + "\nAs you make your way out of the cave and back into the light of the day, you marvel at the many hidden wonders of God creations yet to be seen."
                    + "\nTruly, God's creations are magnificient!"
                );
                break;
            case "5":
                System.out.println(
                    "\nAmidst the darkness of the night you gaze upon the heavenly expanse above you, whose glistening lights combat bravely against the night."
                    + "\nYou reflect upon the words of Alma who recently refuted the anti-christ, Korihor:"
                    + "\n\"All things denote there is a God; yea, even the earth, and all things that are upon the face of it, yea, and its motion,"
                    + "\nyea, and also all the planets which move in their regular form do witness that there is a Supreme Creator.\""
                    + "\nGazing upon the expanse of the heavens. You see a shower of lights raining down towards the earth in a glowing spectacle. "
                    + "\nYou marvel how God created all this for the benefit and furtherance of mankind."
                    + "\nTruly, God's creations are magnificient!"
                );
                break;
            case "6":
                 goToGameMenu();
                 break;
            default:
                System.out.println("\nInvalid selection.");
        }
        return false;
    }
    private void goToGameMenu(){
        GameMenuView game = new GameMenuView();
        game.display();
    }
}

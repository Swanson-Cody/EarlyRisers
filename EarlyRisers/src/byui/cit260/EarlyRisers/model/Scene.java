/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.model;


import byui.cit260.EarlyRisers.main.Game;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Heather
 */
public class Scene implements Serializable {
    
        private String name;
        private String description;
        private Question question;
        private String item;
        private String symbol;
        
     
        
    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    

    /**
     * Get the value of description
     *
     * @return the value of description
     */
    public String getScene() {
        return description;
    }

    /**
     * Set the value of description
     *
     * @param description new value of description
     */
    public void setScene(String description) {
        this.description = description;
    }
    
    public static void getMapSymbol(int MAX_ROW, int MAX_COL){
        Game theGame = new Game();
        //public static void getMapSymbol(int MAX_ROW, int MAX_COL){
//        MAX_ROW = 5;
//        MAX_COL = 5;

        Map theMap = new Map(MAX_ROW, MAX_COL);
        
        //private Map theMap;
        
        String church = "The church is where you can go to whorship and pay tithing.";
        
        for(int i = 0; i < MAX_ROW; i++) {
            // create a new Location object
            Location loc = new Location();
            loc.setDescription(church);
            loc.setSymbol("CHU");
            theMap.setLocation(i, 2, loc);
        }
        
        // define the string for the City's Granary location
        String granary = "A tall silo where all of your wheat is stored";
        
        for(int i = 0; i < MAX_ROW; i++) {
            // create a new Location object
            Location loc = new Location();
            // set a granary location with a hint
            loc.setDescription(granary + "\nIt takes 20 bushels to feed one person");
            loc.setSymbol("###");
            theMap.setLocation(i, 3, loc);
        }
        
        String farmland = "You are in the wheat fields and they are looking really great!";
        
        for(int i = 0; i < MAX_ROW; i++) {
            // create a new Location object
            Location loc = new Location();
            loc.setDescription(farmland + "\nOne bushel will plant two acres of wheat.");
            loc.setSymbol("WHE");
            theMap.setLocation(i, 6, loc);
        }
        
        String shop = "You are at the tool shop. You can buy supplies here.";
        
        for(int i = 0; i < MAX_ROW; i++) {
            // create a new Location object
            Location loc = new Location();
            loc.setDescription(shop + "\n There are oxen, horses, hoes and a bunch of other things here.");
            loc.setSymbol("$$$");
            theMap.setLocation(i, 5, loc);
        }
        
       
        String warehouse = "The warehouse where you store all of your things";
        for(int i = 0; i < MAX_ROW; i++) {
            // create a new Location object
            Location loc = new Location();
            // set a desert location with a hint
            loc.setDescription(warehouse);
            loc.setSymbol("///");
            theMap.setLocation(i, 1, loc);
        }
        
        // define the string for the Village location
        String Home = "You are at home, there is literally nothing for you to do here.";
        
        for(int i = 0; i < MAX_ROW; i++) {
            // create a new Location object
            Location loc = new Location();
            // set a village location with a hint
            loc.setDescription(Home + "\nStop being anti social and do somthing!");
            loc.setSymbol("^^^");
            theMap.setLocation(i, 4, loc);
        }
        
        // create a string that will go in the Location objects
        // that contain the river
        String moreWheat = "More fields of wheat! That's a lot of wheat now you can eat hehehehe!";
        
        // set this location object in each cell of the array in column 4
        for(int i = 0; i < MAX_ROW; i++) {
            // create a new Location object
            Location loc = new Location();
            loc.setDescription(moreWheat);
            loc.setSymbol("W++");
            theMap.setLocation(i, 7, loc);
        }
        
        // define the string for the Lamanite border location
        String chapel = "Another Chapel, these things are so great!!!";
        for(int i = 0; i < MAX_ROW; i++) {
            // create a new Location object
            Location loc = new Location();
            loc.setDescription(chapel);
            loc.setSymbol("|||");
            theMap.setLocation(i, 0, loc);
        }
        
        theGame.setMap(theMap);
    }
    


    public void setMapSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * Get the value of question
     *
     * @return the value of question
     */
    public Question getQuestion() {
        return question;
    }

    /**
     * Set the value of question
     *
     * @param question new value of question
     */
    public void setQuestion(Question question) {
        this.question = question;
    }

    

    /**
     * Get the value of item
     *
     * @return the value of item
     */
    public String getItem() {
        return item;
    }

    /**
     * Set the value of item
     *
     * @param item new value of item
     */
    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.description);
        hash = 67 * hash + Objects.hashCode(this.question);
        hash = 67 * hash + Objects.hashCode(this.item);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "name=" + name + ", description=" + description + ", question=" + question + ", item=" + item + '}';
    }

   

        
}



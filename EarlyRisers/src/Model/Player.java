/*
 * Inventory
 */
package Model;

import static EarlyRisers.EarlyRisers.testHeatherClasses;
import java.io.Serializable;
import java.util.Objects;



/**
 *
 * @author Rachel
 */
public class Player implements Serializable {
    
    private String name;
    private int time;
    
   public Player(){
   }
   public Player(String name, int time){
   this.name = name;
   this.time = time;
   }
   public String getName(){
   return name;}
   
   
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

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

    @Override
    public String toString() {
        return "Player{" + "name=" + name + '}';
    }
    public static void testRachelClasses(){
    }
    
    public static void main(String[] args){
         
        testRachelClasses();
        
    }
    
}



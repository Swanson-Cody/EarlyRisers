/*
 * Inventory
 */
package byui.cit260.EarlyRisers.model;

//import static byui.cit260.EarlyRisers.main.EarlyRisers.testHeatherClasses;
import java.io.Serializable;
import java.util.Objects;



/**
 *
 * @author Rachel
 */
public class Player implements Serializable {
    
    private String name;
    private int time;
    
//   public Player(String name, int time){
//   this.name = name;
//   this.time = time;
//   }
//   public String getName(){
//   return name;
//   }
   
   
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
    public String getName(){
        return this.name;
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
     * Get the value of time
     *
     * @return the value of time
     */
    public int getTime(){
        return this.time;
    }

    /**
     * Set the value of time
     *
     * @param time new value of time
     */
    public void setTime(int time) {
        this.time = time;
    }

//    @Override
//    public Double toString() {
//        return "Player{" + "name=" + name + '}';

//    public void setName(Player player) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    }
 
//    public static void main(String[] args){
//         
//        testRachelClasses();
//        
//    }
    
//}



/*
 * Inventory Class
 */
package byui.cit260.EarlyRisers.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Rachel
 */
public class InventoryItem implements Serializable{
    
    private String itemType;
//    private String provisions;
//    private String animals;
//    private int tithing;
//    private int population;
    private int quantity;
//    private int land;
//    private int wheat;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
//    public int getLand() {
//        return land;
//    }
//
//    public void setLand(int acresOfLand) {
//        this.land = acresOfLand;
//    }
//    
//    public int getWheat() {
//        return wheat;
//    }
//
//    public void setWheat(int wheat) {
//        this.wheat = wheat;
//    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
 
//public static void testInventoryItemClasses(){
//       InventoryItem item = new InventoryItem();
//       item.setItemType("Hammer");
//       item.setProvisions("Wheat");
//       item.setAnimals("Rats");
//       item.setTithing(100);
//       System.out.println(item.toString());
//         }

    public InventoryItem(String itemType, int quantity) {
       this.itemType = itemType;
       this.quantity = quantity;
      
    }
    public InventoryItem (String itemType, String name, int quantity) {
       this.itemType = itemType;
       this.quantity = quantity;
       this.name = name;
    }
    public InventoryItem() {
        
    }

     
    
         
    /**
     * Get the value of itemType
     *j
     * @return the value of itemType
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * Set the value of itemType
     *
     * @param itemType new value of itemType
     */
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

   

//    /**
//     * Get the value of provisions
//     *
//     * @return the value of provisions
//     */
//    public String getProvisions() {
//        return provisions;
//    }
//
//    /**
//     * Set the value of provisions
//     *
//     * @param provisions new value of provisions
//     */
//    public void setProvisions(String provisions) {
//        this.provisions = provisions;
//    }
//
//    
//
//    /**
//     * Get the value of animals
//     *
//     * @return the value of animals
//     */
//    public String getAnimals() {
//        return animals;
//    }
//
//    /**
//     * Set the value of animals
//     *
//     * @param animals new value of animals
//     */
//    public void setAnimals(String animals) {
//        this.animals = animals;
//    }
//
//    
//
//    /**
//     * Get the value of tithing
//     *
//     * @return the value of tithing
//     */
//    public int getTithing() {
//        return tithing;
//    }
//
//    /**
//     * Set the value of tithing
//     *
//     * @param tithing new value of tithing
//     */
//    public void setTithing(int tithing) {
//        this.tithing = tithing;
//    }
//    
//    public int getPopulation() {
//        return population;
//    }
//
//    public void setPopulation(int population) {
//        this.population = population;
//    }
    
    @Override
    public String toString() {
        return "InventoryItem{" + "itemType=" + itemType + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.itemType);
//        hash = 23 * hash + Objects.hashCode(this.provisions);
//        hash = 23 * hash + Objects.hashCode(this.animals);
//        hash = 23 * hash + this.tithing;
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
        final InventoryItem other = (InventoryItem) obj;
//        if (this.tithing != other.tithing) {
//            return false;
//        }
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
//        if (!Objects.equals(this.provisions, other.provisions)) {
//            return false;
//        }
//        if (!Objects.equals(this.animals, other.animals)) {
//            return false;
//        }
        return true;
    }

    
}

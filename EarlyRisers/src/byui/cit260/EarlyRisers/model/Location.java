/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.model;

import java.io.Serializable;

/**
 *
 * @author Cody
 */
public class Location implements Serializable{
    
    private boolean visited;
    private int row;
    private int column;
    private String description;
    private String symbol;
    private Question question;
    private InventoryItem item;
    private boolean locVisited;

    public boolean isLocVisited() {
        return locVisited;
    }

    public void setLocVisited(boolean locVisited) {
        this.locVisited = locVisited;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public InventoryItem getItem() {
        return item;
    }

    public void setItem(InventoryItem item) {
        this.item = item;
    }
    public Location(){
        
    }

    /**
     * Get the value of visited
     *
     * @return the value of visited
     */
    public boolean isVisited() {
        return visited;
    }

    /**
     * Set the value of visited
     *
     * @param visited new value of visited
     */
    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    
        public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
  
    /**
     * Get the value of row
     *
     * @return the value of row
     */
    public int getRow() {
        return row;
    }
    
    /**
     * Set the value of row
     *
     * @param row new value of row
     */
    public void setRow(int row) {
        this.row = row;
    }

    
    /**
     * Get the value of column
     *
     * @return the value of column
     */
    public int getColumn() {
        return column;
    }

    /**
     * Set the value of column
     *
     * @param column new value of column
     */
    public void setColumn(int column) {
        this.column = column;
    }



    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + (this.visited ? 1 : 0);
        hash = 73 * hash + this.row;
        hash = 73 * hash + this.column;
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
        final Location other = (Location) obj;
        if (this.visited != other.visited) {
            return false;
        }
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "visited=" + visited + ", row=" + row + ", column=" + column + '}';
    }


        public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    

}

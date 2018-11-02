/*
 * The point
 */
package byui.cit260.EarlyRisers.model;

import java.io.Serializable;

/**
 *
 * @author Rachel
 */
public class Point implements Serializable{
    
    private int row;
    private int column;

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

    
    
    
    @Override
    public int hashCode(){
        int hash = 5;
        hash = 23 * hash + this.row;
        hash = 23 * hash + this.column;
        return hash;
        
    }

    /**
     * Set the value of column
     *
     * @param column new value of column
     */
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
        final Point other = (Point) obj;
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
        return "Point{" + "row=" + row + ", column=" + column + '}';
    }
    
    

    public static void testRachelClasses() {
    }
    public void setColumn(int column) {
        this.column = column;
        testRachelClasses();
    }

}

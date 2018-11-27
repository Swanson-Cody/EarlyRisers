/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.model;


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
    
    public String getMapSymbol(){
        return symbol;
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



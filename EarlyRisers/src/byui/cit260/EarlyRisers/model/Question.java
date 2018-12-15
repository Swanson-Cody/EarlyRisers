/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.model;

//import static byui.cit260.EarlyRisers.main.EarlyRisers.testHeatherClasses;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Heather
 */
public class Question implements Serializable {

    private String questionText;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private int correctAnswer;
    private int points;
    private int totalPoints;
    

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }
    

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    /**
     * Get the value of questionTest
     *
     * @return the value of questionTest
     */
    public String getQuestionText() {
        return questionText;
    }

    /**
     * Set the value of questionTest
     *
     * @param questionTest new value of questionTest
     */
    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    /**
     * Get the value of answer1
     *
     * @return the value of answer1
     */
    public String getAnswer1() {
        return answer1;
    }

    /**
     * Set the value of answer1
     *
     * @param answer1 new value of answer1
     */
    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    /**
     * Get the value of answer2
     *
     * @return the value of answer2
     */
    public String getAnswer2() {
        return answer2;
    }

    /**
     * Set the value of answer2
     *
     * @param answer2 new value of answer2
     */
    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    /**
     * Get the value of answer3
     *
     * @return the value of answer3
     */
    public String getAnswer3() {
        return answer3;
    }

    /**
     * Set the value of answer3
     *
     * @param answer3 new value of answer3
     */
    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    /**
     * Get the value of answer4
     *
     * @return the value of answer4
     */
    public String getAnswer4() {
        return answer4;
    }

    /**
     * Set the value of answer4
     *
     * @param answer4 new value of answer4
     */
    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    /**
     * Get the value of correctAnswer
     *
     * @return the value of correctAnswer
     */
    public int getCorrectAnswer() {
        return correctAnswer;
    }

    /**
     * Set the value of correctAnswer
     *
     * @param correctAnswer new value of correctAnswer
     */
    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.questionText);
        hash = 97 * hash + Objects.hashCode(this.answer1);
        hash = 97 * hash + Objects.hashCode(this.answer2);
        hash = 97 * hash + Objects.hashCode(this.answer3);
        hash = 97 * hash + Objects.hashCode(this.answer4);
        hash = 97 * hash + this.correctAnswer;
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
        final Question other = (Question) obj;
        if (this.correctAnswer != other.correctAnswer) {
            return false;
        }
        if (!Objects.equals(this.questionText, other.questionText)) {
            return false;
        }
        if (!Objects.equals(this.answer1, other.answer1)) {
            return false;
        }
        if (!Objects.equals(this.answer2, other.answer2)) {
            return false;
        }
        if (!Objects.equals(this.answer3, other.answer3)) {
            return false;
        }
        if (!Objects.equals(this.answer4, other.answer4)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Question{" + "questionTest=" + questionText + ", answer1=" + answer1 + ", answer2=" + answer2 + ", answer3=" + answer3 + ", answer4=" + answer4 + ", correctAnswer=" + correctAnswer + '}';
    }

}

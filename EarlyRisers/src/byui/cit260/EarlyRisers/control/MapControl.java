/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.EarlyRisers.control;

import byui.cit260.EarlyRisers.model.InventoryItem;
import byui.cit260.EarlyRisers.model.Location;
import byui.cit260.EarlyRisers.model.Map;
import byui.cit260.EarlyRisers.model.Player;
import byui.cit260.EarlyRisers.model.Question;

import byui.cit260.EarlyRisers.exceptions.MapControlException;

/**
 *
 * public static Map createMap( Game game, int noOfRows, int noOfColumns)
 */
public class MapControl {

    public static Map createMap() throws MapControlException {
        int MAX_ROW = 5;
        int MAX_COL = 5;

        Map map = new Map(MAX_ROW, MAX_COL);

        Location[][] locations = new Location[MAX_ROW][MAX_COL];
        map.setLocations(locations);

        for (int row = 0; row < MAX_ROW; row++) {
            Location loc1 = new Location();
            loc1.setDescription("Wheat Field " + (row + 1));
            loc1.setSymbol("W" + (row + 1));
            map.setLocation(row, 1, loc1);
            

        }
        Location loc = map.getLocations()[0][1];
        InventoryItem item = new InventoryItem("rat", 3);
        loc.setItem(item);
        Question question = new Question();
        question.setQuestionText("Who is the mayor of this town?");
        question.setAnswer1("1: Moroni!");
        question.setAnswer2("2: Aaron");
        question.setAnswer3("3: Ether");
        question.setAnswer4("4: Esther");
        question.setCorrectAnswer(2);
        question.setPoints(5);
        loc.setQuestion(question);
        loc.setVisited(false);
        loc.setLocVisited(false);

        loc = map.getLocations()[1][1];
        item = new InventoryItem("potato", 3);
        loc.setItem(item);
        question = new Question();
        question.setQuestionText("Which of the following people was NOT one of Lehi's sons?");
        question.setAnswer1("1: Jacob");
        question.setAnswer2("2: Joseph");
        question.setAnswer3("3: Sam");
        question.setAnswer4("4: Jarom");
        question.setCorrectAnswer(4);
        question.setPoints(5);
        loc.setQuestion(question);
        loc.setVisited(false);
        loc.setLocVisited(false);

        loc = map.getLocations()[2][1];
        item = new InventoryItem("potato", 3);
        loc.setItem(item);
        question = new Question();
        question.setQuestionText("How many books are in the Book of Mormon?");
        question.setAnswer1("1: 14!");
        question.setAnswer2("2: 17");
        question.setAnswer3("3: 11");
        question.setAnswer4("4: 15");
        question.setCorrectAnswer(4);
        question.setPoints(5);
        loc.setQuestion(question);
        loc.setVisited(false);
        loc.setLocVisited(false);

        loc = map.getLocations()[3][1];
        item = new InventoryItem("potato", 3);
        loc.setItem(item);
        question = new Question();
        question.setQuestionText("Who is the Lamanitish woman who called the people when Ammon and the Kings household were overcome?");
        question.setAnswer1("1: Akish");
        question.setAnswer2("2: Amy");
        question.setAnswer3("3: Abish");
        question.setAnswer4("4: Esther");
        question.setCorrectAnswer(3);
        question.setPoints(5);
        loc.setQuestion(question);
        loc.setVisited(false);
        loc.setLocVisited(false);

        loc = map.getLocations()[4][1];
        item = new InventoryItem("potato", 3);
        loc.setItem(item);
        question = new Question();
        question.setQuestionText("The following were all in the box that Joseph found in the hill except...?");
        question.setAnswer1("1: Gold Plates");
        question.setAnswer2("2: A breastplate");
        question.setAnswer3("3: Urim and Thummim");
        question.setAnswer4("4: Sword of Laban");
        question.setCorrectAnswer(4);
        question.setPoints(5);
        loc.setQuestion(question);
        loc.setVisited(false);
        loc.setLocVisited(false);

        //Create the Church       
        for (int row = 0; row < MAX_ROW; row++) {
            Location loc2 = new Location();
            loc2.setDescription("Church" + (row + 1));
            loc2.setSymbol("C" + (row + 1));
            map.setLocation(row, 2, loc2);
            

        }
//               
        loc = map.getLocations()[0][2];
        item = new InventoryItem("potato", 3);
        loc.setItem(item);
        question = new Question();
        question.setQuestionText("The following were all sons of Mosiah except...?");
        question.setAnswer1("1: Aaron");
        question.setAnswer2("2: Omner");
        question.setAnswer3("3: Alma");
        question.setAnswer4("4: Ammon");
        question.setCorrectAnswer(3);
        question.setPoints(5);
        loc.setQuestion(question);
        loc.setVisited(false);
        loc.setLocVisited(false);

        loc = map.getLocations()[1][2];
        item = new InventoryItem("potato", 3);
        loc.setItem(item);
        question = new Question();
        question.setQuestionText("Not only was I the last Jaredite King, I was the last Jaredite?");
        question.setAnswer1("1: Coriantumr");
        question.setAnswer2("2: Corihor");
        question.setAnswer3("3: Chemish");
        question.setAnswer4("4: Cohor");
        question.setCorrectAnswer(1);
        question.setPoints(5);
        loc.setQuestion(question);
        loc.setVisited(false);
        loc.setLocVisited(false);

        loc = map.getLocations()[2][2];
        item = new InventoryItem("potato", 3);
        loc.setItem(item);
        question = new Question();
        question.setQuestionText("What happened to Samuel after he left the wall?");
        question.setAnswer1("1: he came back to the city in a disguise");
        question.setAnswer2("2: he was murdered by Gadianton robbers");
        question.setAnswer3("3: he was caught and put in prison");
        question.setAnswer4("4: he was never seen again among the Nephites");
        question.setCorrectAnswer(4);
        question.setPoints(5);
        loc.setQuestion(question);
        loc.setVisited(false);
        loc.setLocVisited(false);

        loc = map.getLocations()[3][2];
        item = new InventoryItem("potato", 3);
        loc.setItem(item);
        question = new Question();
        question.setQuestionText("The destruction of Ammonihah was so terrible that the land was not called Ammonihah, but rather...?");
        question.setAnswer1("1: Desolation of Ammonihah");
        question.setAnswer2("2: Desolation of Sinners");
        question.setAnswer3("3: Desolation of Sodom");
        question.setAnswer4("4: Desolation of Nehors");
        question.setCorrectAnswer(4);
        question.setPoints(5);
        loc.setQuestion(question);
        loc.setVisited(false);
        loc.setLocVisited(false);

        loc = map.getLocations()[4][2];
        item = new InventoryItem("potato", 3);
        loc.setItem(item);
        question = new Question();
        question.setQuestionText("This silver coin was worth four senums.");
        question.setAnswer1("1: Ergnom");
        question.setAnswer2("2: Eeth");
        question.setAnswer3("3: Ezrom");
        question.setAnswer4("4: Eunum");
        question.setCorrectAnswer(3);
        question.setPoints(5);
        loc.setQuestion(question);
        loc.setVisited(false);
        loc.setLocVisited(false);

        //Create the Tool Shop        
        for (int row = 0; row < MAX_ROW; row++) {
            Location loc3 = new Location();
            loc3.setDescription("Tool Shop" + (row + 1));
            loc3.setSymbol("T" + (row + 1));
            map.setLocation(row, 3, loc3);
            
        }

        loc = map.getLocations()[0][3];
        item = new InventoryItem("potato", 3);
        loc.setItem(item);
        question = new Question();
        question.setQuestionText("I was an 'exceedingly curious man'?");
        question.setAnswer1("1: Heleman");
        question.setAnswer2("2: Hagoth");
        question.setAnswer3("3: Ham");
        question.setAnswer4("4: Helem");
        question.setCorrectAnswer(2);
        question.setPoints(5);
        loc.setQuestion(question);
        loc.setVisited(false);
        loc.setLocVisited(false);

        loc = map.getLocations()[1][3];
        item = new InventoryItem("potato", 3);
        loc.setItem(item);
        question = new Question();
        question.setQuestionText("What word means 'many waters'");
        question.setAnswer1("1: Illiad");
        question.setAnswer2("2: Ishmeal");
        question.setAnswer3("3: Idumea");
        question.setAnswer4("4: Irreantum");
        question.setCorrectAnswer(4);
        question.setPoints(5);
        loc.setQuestion(question);
        loc.setVisited(false);
        loc.setLocVisited(false);

        loc = map.getLocations()[2][3];
        item = new InventoryItem("potato", 3);
        loc.setItem(item);
        question = new Question();
        question.setQuestionText("What city was destroyed but known for its murders, "
                + "secret combinations, and the fact they destroyed the government?");
        question.setAnswer1("1: Jacobugath");
        question.setAnswer2("2: Jershon");
        question.setAnswer3("3: Jerusalem");
        question.setAnswer4("4: Jashon");
        question.setCorrectAnswer(1);
        question.setPoints(5);
        loc.setQuestion(question);
        loc.setVisited(false);
        loc.setLocVisited(false);

        loc = map.getLocations()[3][3];
        item = new InventoryItem("potato", 3);
        loc.setItem(item);
        question = new Question();
        question.setQuestionText("I was an Anti-Christ?");
        question.setAnswer1("1: Kishkumen");
        question.setAnswer2("2: Korihor");
        question.setAnswer3("3: Kimnor");
        question.setAnswer4("4: Kumen");
        question.setCorrectAnswer(1);
        question.setPoints(5);
        loc.setQuestion(question);
        loc.setVisited(false);
        loc.setLocVisited(false);

        loc = map.getLocations()[4][3];
        item = new InventoryItem("potato", 3);
        loc.setItem(item);
        question = new Question();
        question.setQuestionText("____ fell that men might be; and men are, that the might have ____.");
        question.setAnswer1("1: Eve, posterity");
        question.setAnswer2("2: Moses, land");
        question.setAnswer3("3: Adam, joy");
        question.setAnswer4("4: Moses, land");
        question.setCorrectAnswer(3);
        question.setPoints(5);
        loc.setQuestion(question);
        loc.setVisited(false);
        loc.setLocVisited(false);

//Create the beauty of the Earth        
        for (int row = 0; row < MAX_ROW; row++) {
            Location loc4 = new Location();
            loc4.setDescription("For the Beauty of the Earth" + (row + 1));
            loc4.setSymbol("B" + (row + 1));
            map.setLocation(row, 4, loc4);
           

        }

        loc = map.getLocations()[0][4];
        item = new InventoryItem("potato", 3);
        loc.setItem(item);
        question = new Question();
        question.setQuestionText("When Ishmeal died, he was buried here?");
        question.setAnswer1("1: Nephihah");
        question.setAnswer2("2: Ninevah");
        question.setAnswer3("3: Nowhere, he was taken to heaven");
        question.setAnswer4("4: Nahom");
        question.setCorrectAnswer(4);
        question.setPoints(5);
        loc.setQuestion(question);
        loc.setVisited(false);
        loc.setLocVisited(false);

        loc = map.getLocations()[1][4];
        item = new InventoryItem("potato", 3);
        loc.setItem(item);
        question = new Question();
        question.setQuestionText("I was one of the 4 sons of Mosiah'");
        question.setAnswer1("1: Onidah");
        question.setAnswer2("2: Onnon");
        question.setAnswer3("3: Mosiah only had 3 sons");
        question.setAnswer4("4: Omner");
        question.setCorrectAnswer(4);
        question.setPoints(5);
        loc.setQuestion(question);
        loc.setVisited(false);
        loc.setLocVisited(false);

        loc = map.getLocations()[2][4];
        item = new InventoryItem("shovel", 1);
        loc.setItem(item);
        question = new Question();
        question.setQuestionText("Corniantumr killed me against the walls of the city?");
        question.setAnswer1("1: Paanchi");
        question.setAnswer2("2: Pahoran");
        question.setAnswer3("3: Pacumeni");
        question.setAnswer4("4: Pachus");
        question.setCorrectAnswer(3);
        question.setPoints(5);
        loc.setQuestion(question);
        loc.setVisited(false);
        loc.setLocVisited(false);

        loc = map.getLocations()[3][4];
        item = new InventoryItem("potato", 3);
        loc.setItem(item);
        question = new Question();
        question.setQuestionText("Amalakiah took this Lamanite queen as his wife?");
        question.setAnswer1("1: Abish");
        question.setAnswer2("2: Isabel");
        question.setAnswer3("3: Saria");
        question.setAnswer4("4: We were not told her name");
        question.setCorrectAnswer(4);
        question.setPoints(5);
        loc.setQuestion(question);
        loc.setVisited(false);
        loc.setLocVisited(false);

        loc = map.getLocations()[4][4];
        item = new InventoryItem("potato", 3);
        loc.setItem(item);
        question = new Question();
        question.setQuestionText("Name meaning 'holy stand'");
        question.setAnswer1("1: Rameumptom");
        question.setAnswer2("2: Ripliancum");
        question.setAnswer3("3: Rabbana");
        question.setAnswer4("4: Roshana");
        question.setCorrectAnswer(1);
        question.setPoints(5);
        loc.setQuestion(question);
        loc.setVisited(false);
        loc.setLocVisited(false);

//Create the inventory shop
        for (int row = 0; row < MAX_ROW; row++) {
            Location loc0 = new Location();
            loc0.setDescription("Inventory" + (row + 1));
            loc0.setSymbol("I" + (row + 1));
            map.setLocation(row, 0, loc0);
           
        }
        loc = map.getLocations()[0][0];
        item = new InventoryItem("potato", 3);
        loc.setItem(item);
        question = new Question();
        question.setQuestionText("Ammon defended the flocks after being in the service of the king for how long?");
        question.setAnswer1("1: 3 days");
        question.setAnswer2("2: 3 weeks");
        question.setAnswer3("3: 3 months");
        question.setAnswer4("4: 3 years");
        question.setCorrectAnswer(1);
        question.setPoints(5);
        loc.setQuestion(question);
        loc.setVisited(false);
        loc.setLocVisited(false);

        loc = map.getLocations()[1][0];
        item = new InventoryItem("potato", 3);
        loc.setItem(item);
        question = new Question();
        question.setQuestionText("Who was one of the 12 Nephite disciples");
        question.setAnswer1("1: Judas");
        question.setAnswer2("2: Jonah");
        question.setAnswer3("3: Jonas");
        question.setAnswer4("4: Judah");
        question.setCorrectAnswer(3);
        question.setPoints(5);
        loc.setQuestion(question);
        loc.setVisited(false);
        loc.setLocVisited(false);

        loc = map.getLocations()[2][0];
        item = new InventoryItem("shovel", 1);
        loc.setItem(item);
        question = new Question();
        question.setQuestionText("What farewell phrase is used in the Book of Mormon?");
        question.setAnswer1("1: adios");
        question.setAnswer2("2: adieu");
        question.setAnswer3("3: goodbye");
        question.setAnswer4("4: ciao");
        question.setCorrectAnswer(2);
        question.setPoints(5);
        loc.setQuestion(question);
        loc.setVisited(false);
        loc.setLocVisited(false);

        loc = map.getLocations()[3][0];
        item = new InventoryItem("potato", 3);
        loc.setItem(item);
        question = new Question();
        question.setQuestionText("What term is used in the Book of Mormon?");
        question.setAnswer1("1: lagoon");
        question.setAnswer2("2: bay");
        question.setAnswer3("3: ocean");
        question.setAnswer4("4: gulf");
        question.setCorrectAnswer(4);
        question.setPoints(5);
        loc.setQuestion(question);
        loc.setVisited(false);
        loc.setLocVisited(false);

        loc = map.getLocations()[4][0];
        item = new InventoryItem("potato", 3);
        loc.setItem(item);
        question = new Question();
        question.setQuestionText("What mountain did the brother of Jared say 'Remove' and it removed?");
        question.setAnswer1("1: Zerin");
        question.setAnswer2("2: Serphim");
        question.setAnswer3("3: Jershap");
        question.setAnswer4("4: Shimrod");
        question.setCorrectAnswer(1);
        question.setPoints(5);
        loc.setQuestion(question);
        loc.setVisited(false);
        loc.setLocVisited(false);

        movePlayerToStartingLocation(map);
        return map;
    }

    public static void movePlayerToStartingLocation(Map map) throws MapControlException {
        // If starting location is not supposed to be 0,0 then use the correct values here.
        movePlayer(map, 0, 0);
    }

    public static void movePlayer(Map map, int row, int column) throws MapControlException {

        Player player = new Player();
        if (player == null) {
            throw new MapControlException("You must have a player");
        }

        map.setCurrentLocation(map.getLocations()[row][column]);
        map.setCurrentRow(row);
        map.setCurrentColumn(column);
        map.getCurrentLocation().setVisited(true);
    }
}

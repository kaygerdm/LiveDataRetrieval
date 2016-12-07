
import java.text.ParseException;
import java.util.ArrayList;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


/**
 *Model class that takes in parsed JSONObject and parses out information pertaining to game weeks
 * @author kayger
 */
public class NFLWeekModel {

    private String number;
    private String weekID;
    private ArrayList<NFLGameModel> gamesList = new ArrayList<NFLGameModel>();

    /**
     *empty constructor 
     */
    public NFLWeekModel() {
    }

    /**
     * Full constructor that takes in a JSONObject
     * @param obj JSONObject 
     * @throws ParseException for JSONObject
     */
    public NFLWeekModel(JSONObject obj) throws ParseException {

        if (obj.has("id")) {
            weekID = obj.getString("id");
        }
        if (obj.has("number")) {
            number = obj.getString("number");
        }

        JSONArray games = obj.getJSONArray("games");
        for (int k = 0; k < games.size(); k++) {
            JSONObject game = (JSONObject) games.get(k);
                    //collect game IDs

            NFLGameModel g1 = new NFLGameModel(game);
            gamesList.add(g1);

        }

    }

    /**
     * getter method
     * @return string value
     */
    public String getNumber() {
        return number;
    }

    /**
     *getter method
     * @return string value
     */
    public String getWeekID() {
        return weekID;
    }

    /**
     *getter method
     * @return string value
     */
    public ArrayList<NFLGameModel> getGames() {

        return gamesList;
    }

    /**
     *toString method
     * @return string value composed of all parsed string values collected above
     */
    @Override
    public String toString() {
        String gameString = "";
        for (NFLGameModel g1 : gamesList) {
            gameString += "" + g1 + "\n";
        }
        String output3 = number + "\n " + weekID + "\n " + gameString;
        return output3;
    }

}


import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.io.IOUtils;

/**
 * This is the controller class to this program. The URL is read in this class, the information is passed to the specified model class, 
 * a text file is created, and a call to the GUI is made displaying the text file. 
 * @author kduranmateo
 */
public class NFLController {

    private final String key = "ad2z3yqjrqazy4ternqk39gj";
    private ArrayList<NFLTeamModel> teamList;

    /**
     * This method reads in the specified URL which is surrounded by a try catch that calls the server and returns the content in JSON format. 
     * After the content is retrieved is is parsed and then a call to the GUI is made. 
     * @throws IOException for URL try catch
     * @throws ParseException For URL and JSON content
     */
    public void start() throws IOException, ParseException {

        try {
            //URL
            String URL = readURL("http://api.sportradar.us/nfl-t1/teams/hierarchy.json?api_key=" + key);

            //ArrayList
            teamList = new ArrayList<>();
            //rendering object
            JSONObject obj = JSONObject.fromObject(URL);
            //JSOnArray of components
            JSONArray conferences = obj.getJSONArray("conferences");
            //get divisions
            for (int i = 0; i < conferences.size(); i++) {
                JSONObject conference = (JSONObject) conferences.get(i);

                JSONArray divisions = conference.getJSONArray("divisions");

                for (int j = 0; j < divisions.size(); j++) {
                    JSONObject division = (JSONObject) divisions.get(j);
                    JSONArray teams = division.getJSONArray("teams");

                    for (int k = 0; k < teams.size(); k++) {
                        JSONObject team = (JSONObject) teams.get(k);
                        NFLTeamModel t1 = new NFLTeamModel(team);
                        teamList.add(t1);
                    }
                }

            }

            //season URL
            URL = readURL("http://api.sportradar.us/nfl-t1/2015/REG/schedule.json?api_key=" + key);

            JSONObject obj2 = JSONObject.fromObject(URL);
            NFLSeasonSchedModel s1 = new NFLSeasonSchedModel(obj2);

            NFLGUI run2 = new NFLGUI();
            NFLSeasonSchedModel s2 = new NFLSeasonSchedModel();
            run2.display(s1, s2);
            // System.out.println(s1);
        } catch (IOException e) {
            System.out.println("Server Unavailable, try again!");
            throw new IOException("Server Unavailable, try again!");
        }

    }
    /**
     * private helper method that reads the URL 
     * @param webservice
     * @return a string 
     * @throws java.net.MalformedURLException
     * @throws java.io.IOException 
     */

    private String readURL(String webservice) throws java.net.MalformedURLException, java.io.IOException {
     // create a URL object from the given address		
        URL service = new URL(webservice);

     // use IOUtils to access the URL and return a string		
        String result = IOUtils.toString(service, "UTF-8");
        return result;
    }
}

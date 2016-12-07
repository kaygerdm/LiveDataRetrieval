
/**
 *
 * @author kayger
 */
public class NFLTeamModel {
    
    //private instance variables
    private String teamID;
    private String tName;
    private String tMarket;

    public NFLTeamModel(String teamID, String tName, String tMarket) {
        this.teamID = teamID;
        this.tName = tName;
        this.tMarket = tMarket;
    }
    
    public NFLTeamModel(JSON obj){
       
    }

    public String getTeamID() {
        return teamID;
    }

    public String gettName() {
        return tName;
    }

    public String gettMarket() {
        return tMarket;
    }
    
    
    
}

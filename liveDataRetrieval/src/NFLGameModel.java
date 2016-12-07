
/**
 *
 * @author kayger
 */
public class NFLGameModel {
    NFLGameWeatherModel weather = new NFLGameWeatherModel();
    
    //private instances
    private String gID;
    private String gSchedDate;
    private String gHomeTeam;
    private String gAwayTeam;
    private String gStatus;

    public NFLGameModel(String gID, String gSchedDate, String gHomeTeam, String gAwayTeam, String gStatus) {
        this.gID = gID;
        this.gSchedDate = gSchedDate;
        this.gHomeTeam = gHomeTeam;
        this.gAwayTeam = gAwayTeam;
        this.gStatus = gStatus;
    }

    public String getgID() {
        return gID;
    }

    public String getgSchedDate() {
        return gSchedDate;
    }

    public String getgHomeTeam() {
        return gHomeTeam;
    }

    public String getgAwayTeam() {
        return gAwayTeam;
    }

    public String getgStatus() {
        return gStatus;
    }
    
    
    
}

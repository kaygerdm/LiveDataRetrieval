/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kayger
 */
public class NFLGameWeatherModel {
    
    //private instances
    private String gameTemp;
    private String gameCondition;
    private String gameHumid;
    private String gameWindSpeed;
    private String gameWindDirect;
    
      public NFLGameWeatherModel() {
    }
    

    public NFLGameWeatherModel(String gameTemp, String gameCondition, String gameHumid, String gameWindSpeed, String gameWindDirect) {
        this.gameTemp = gameTemp;
        this.gameCondition = gameCondition;
        this.gameHumid = gameHumid;
        this.gameWindSpeed = gameWindSpeed;
        this.gameWindDirect = gameWindDirect;
    }

    public String getGameTemp() {
        return gameTemp;
    }

    public String getGameCondition() {
        return gameCondition;
    }

    public String getGameHumid() {
        return gameHumid;
    }

    public String getGameWindSpeed() {
        return gameWindSpeed;
    }

    public String getGameWindDirect() {
        return gameWindDirect;
    }

   

  
    
}

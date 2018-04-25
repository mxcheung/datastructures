package au.com.maxcheung.challenges.q3.solvemefirst;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class PageData {
    
    
    
    @JsonProperty("Title")
    @SerializedName("Title")
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    
    
    

}

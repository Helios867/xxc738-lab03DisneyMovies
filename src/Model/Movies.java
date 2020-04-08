package Model;

import java.util.ArrayList;

public class Movies {

    private String moviesName;
    private String uniqueID;
    private String genre;
    private ArrayList<Cast> cast = new ArrayList<Cast>();

    Movies(String moviesName, String uniqueID, String genre){
        this.moviesName=moviesName;
        this.uniqueID=uniqueID;
        this.genre=genre;
    }

    public String toString(){
        return String.format(moviesName+" ["+uniqueID+"], Genre: "+genre+", Cast: " +cast.size());
    }

    public void addCast(Cast cast){
        this.cast.add(cast);
    }

    public String getMoviesName() {
        return moviesName;
    }
    public String getUniqueID() {
        return uniqueID;
    }
    public String getGenre() {
        return genre;
    }
    public ArrayList<Cast> getCast() {
        return cast;
    }

    public void setMoviesName(String moviesName) {
        this.moviesName = moviesName;
    }
    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setCast(ArrayList<Cast> cast) {
        this.cast = cast;
    }
}

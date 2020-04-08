package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DisneyMovies {

    private String dmName;
    private ArrayList<Movies> movies = new ArrayList<Movies>();

    DisneyMovies(String dmName){
        this.dmName=dmName;
    }

    public String toString(){
        return String.format("");
    }

    public void loadMovies(String moviesFile) throws FileNotFoundException{
        Scanner scan = new Scanner(new File(moviesFile));

        while(scan.hasNextLine()){
            String currentLine = scan.nextLine();
            String moviesInfo[] = (currentLine.split(","));
            Movies moviesInfoArr = new Movies(moviesInfo[0],moviesInfo[1],moviesInfo[3]);
            this.getMovies().add(moviesInfoArr);
        }
        scan.close();
    }

    public void loadCharacters(String charactersFile) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(charactersFile));

        while (scan.hasNextLine()) {
            String currentLine = scan.nextLine();
            String charactersInfo[] = (currentLine.split(","));
            Cast charactersInfoArr = new Cast(charactersInfo[0], charactersInfo[1], charactersInfo[2], charactersInfo[4]);
            for (int i = 0; i < this.getMovies().size(); i++) {
                if (charactersInfoArr.getUniqueID().equalsIgnoreCase(this.getMovies().get(i).getUniqueID())) {
                    this.movies.get(i).addCast(charactersInfoArr);
                    break;
                }
            }
        }
        scan.close();
    }

    public String getDmName() {
        return dmName;
    }
    public ArrayList<Movies> getMovies() {
        return movies;
    }

    public void setDmName(String dmName) {
        this.dmName = dmName;
    }
    public void setMovies(ArrayList<Movies> movies) {
        this.movies = movies;
    }
}

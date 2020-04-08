package Model;

public class Cast {

    private String charName;
    private String actName;
    private String role;
    private String nationality;
    private String uniqueID;

    Cast(String charName, String actName, String role, String nationality){
        this.charName=charName;
        this.actName=actName;
        this.role=role;
        this.nationality=nationality;
    }

    public String toString(){
        return String.format("- " +role + charName+ ", "+ actName+ " ("+ nationality+ ")\n");
    }

    public String getCharName(){
        return this.charName;
    }
    public String getActName(){
        return this.actName;
    }
    public String getRole(){
        return this.role;
    }
    public String getNationality(){
        return this.nationality;
    }
    public String getUniqueID() {
        return uniqueID;
    }

    public void setCharName(String charName){
        this.charName=charName;
    }
    public void setActName(String actName){
        this.actName=actName;
    }
    public void setRole(String role){
        this.role=role;
    }
    public void setNationality(String nationality){
        this.nationality=nationality;
    }
    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }
}

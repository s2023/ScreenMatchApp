package model;
import javax.swing.JOptionPane;

public class Title {

    private String name;
    private int releaseDate;
    private double rating;
    private boolean includedInPremium;
    private String synopsis;
    private int durationOnMinutes;

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getreleaseDate() {
        return releaseDate;
    }

    public void setreleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isincludedInPremium() {
        return includedInPremium;
    }

    public void setincludedInPremium(boolean includedInPremium) {
        this.includedInPremium = includedInPremium;
    }

    public int getdurationOnMinutes() {
        return durationOnMinutes;
    }

    public void setdurationOnMinutes(int durationOnMinutes) {
        this.durationOnMinutes = durationOnMinutes;
    }

    public String getsynopsis() {
        return synopsis;
    }

    public void setsynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void showDataSheet(){
        String message = "****************Saved Title Data*******************\n" +
                        "Title: " + name + ".\n" +
                         "Release Year: " + releaseDate + ".\n" +
                         "Synopsis: " + synopsis + ".\n" +
                         "Duration in minutes: " + getdurationOnMinutes() + " minutes.";
        JOptionPane.showMessageDialog(null, message);
    }

}

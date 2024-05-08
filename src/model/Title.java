package model;

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
        System.out.println("***********************************");
        System.out.println("Title Data:");
        System.out.println("Title: " + name + ".");
        System.out.println("Release Year: " + releaseDate + ".");
        System.out.println("Synopsis: " + synopsis + ".");
        System.out.println("Duration in minutes: " + getdurationOnMinutes() + " minutes.");
        System.out.println("***********************************\n");
    }

}

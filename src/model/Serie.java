package model;

public class Serie extends Title {

    private int season;
    private int episodesBySeason;
    private int minutesByEpisode;

    public int getseason() {
        return season;
    }

    public void setseason(int season) {
        this.season = season;
    }

    public int getepisodesBySeason() {
        return episodesBySeason;
    }

    public void setepisodesBySeason(int episodesBySeason) {
        this.episodesBySeason = episodesBySeason;
    }

    public int getminutesByEpisode() {
        return minutesByEpisode;
    }

    public void setminutesByEpisode(int minutesByEpisode) {
        this.minutesByEpisode = minutesByEpisode;
    }

    @Override
    public int getdurationOnMinutes() {
        return minutesByEpisode * season * episodesBySeason;
    }
}

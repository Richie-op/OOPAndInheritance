public class TvShow {
    private int seasons;
    private int episodes;

    public TvShow(int seasons, int episodes){
        this.seasons = seasons;
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }
}

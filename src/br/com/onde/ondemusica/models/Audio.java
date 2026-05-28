package br.com.onde.ondemusica.models;

public class Audio {
    private String title;
    private int duration;
    private int totalReproductions;
    private int totalLikes;
    private int classification;

    public Audio(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public int getTotalReproductions() {
        return totalReproductions;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getClassification() {
        return classification;
    }

    public void like(){
        this.totalLikes++;
    }

    public void reproduce(){
        this.totalReproductions++;
    }
}

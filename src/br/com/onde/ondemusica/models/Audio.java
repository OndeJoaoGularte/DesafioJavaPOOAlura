package br.com.onde.ondemusica.models;

public class Audio {
    private String title;
    private int duration;
    private int totalReproductions;
    private int totalLikes;
    private double classification;

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

    public int getLikes() {
        return totalLikes;
    }

    public double getClassification() {
        return classification;
    }

    public void like(){
        this.totalLikes++;
    }

    public void reproduce(){
        this.totalReproductions++;
    }
}

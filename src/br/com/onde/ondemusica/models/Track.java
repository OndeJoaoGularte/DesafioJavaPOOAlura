package br.com.onde.ondemusica.models;

public class Track extends Audio {
    private String album;
    private String artist;
    private String genre;

    public Track(String title, String artist) {
        super(title);
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public int getClassification() {
        if(this.getTotalReproductions() > 200){
            return 10;
        }else{
            return 7;
        }
    }
}

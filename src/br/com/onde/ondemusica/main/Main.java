package br.com.onde.ondemusica.main;

import br.com.onde.ondemusica.models.MyFavorites;
import br.com.onde.ondemusica.models.Podcast;
import br.com.onde.ondemusica.models.Track;

public class Main {
    static void main(String[] args) {
        Track myTrack = new Track("Robot Voices", "Twenty One Pilots");

        for (int i = 0; i < 1000; i++) {
            myTrack.reproduce();
        }

        for (int i = 0; i < 50; i++) {
            myTrack.like();
        }

        Podcast myPodcast = new Podcast("OndeCode", "OndeJoãoGularte");

        for (int i = 0; i < 50; i++) {
            myPodcast.reproduce();
        }

        for (int i = 0; i < 1000; i++) {
            myPodcast.like();
        }

        MyFavorites favorites = new MyFavorites();
        favorites.include(myTrack);
        favorites.include(myPodcast);
    }
}
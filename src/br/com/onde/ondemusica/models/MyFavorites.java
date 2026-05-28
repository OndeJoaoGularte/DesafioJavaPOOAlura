package br.com.onde.ondemusica.models;

public class MyFavorites {
    public void include(Audio audio){
        if(audio.getClassification() >= 9){
            System.out.println(audio.getTitle() + " é um sucesso absoluto!");
        }else{
            System.out.println(audio.getTitle() + " é legal até...");
        }
    }
}

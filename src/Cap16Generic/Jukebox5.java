package Cap16Generic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EmptyStackException;

public class Jukebox5 {
    ArrayList<Song> songsList = new ArrayList<Song>();

    public static void main(String[] args) {
        new Jukebox5().go();
    }

    class ArtistCompare implements Comparator<Song>{

        public int compare(Song one, Song two){
            return one.getArtist().compareTo(two.getArtist());
        }


    }
    public void go(){

        getSong();
        System.out.println(songsList);
        Collections.sort(songsList);
        System.out.println(songsList);

        ArtistCompare artistCompare = new ArtistCompare();
        Collections.sort(songsList,artistCompare);
        System.out.println(songsList);
    }

    void getSong(){
        try {
            File file = new File("D:\\Full Stack JAVA\\JavaBasics\\HeadFirst Java\\Chap1\\src\\Cap16Generic\\SongListMore");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;

            while ((line = reader.readLine()) != null){
                addSong(line);
            }


        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");

        Song nextSong = new Song(tokens[0], tokens[1], tokens[2],tokens[3]);
        songsList.add(nextSong);
    }


}

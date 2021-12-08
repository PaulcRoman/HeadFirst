package Cap16Generic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Jukebox3 {

    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args) {
        new Jukebox3().go();
    }

    public void go(){
        getSongs();
        System.out.println(songList);
       Collections.sort(songList);// It won't compile - as it does not know on what to sort the songList objects -needs to implement Comparable on Song class
        System.out.println(songList);
    }

    void getSongs(){
        try {
            File file = new File("D:\\Full Stack JAVA\\JavaBasics\\HeadFirst Java\\Chap1\\src\\Cap16Generic\\SongListMore");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) !=null){
                addSong(line);

            }

        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    void addSong(String linetoParse){
        String[] tokens = linetoParse.split("/");

        Song nextSong = new Song(tokens[0], tokens[1],tokens[2],tokens[3]);
        songList.add(nextSong);
    }
}

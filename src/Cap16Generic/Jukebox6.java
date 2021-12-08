package Cap16Generic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ForkJoinPool;

public class Jukebox6 {
    ArrayList<Song> songList = new ArrayList<>();

    public static void main(String[] args) {
        new Jukebox5().go();
    }

    public void go(){
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
        HashSet<Song> songSet = new HashSet<>();
        songSet.addAll(songList);
        System.out.println(songSet);
    }

    void getSongs(){
        try {

            File file = new File("D:\\Full Stack JAVA\\JavaBasics\\HeadFirst Java\\Chap1\\src\\Cap16Generic\\SongListMore");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;

            while ((line = reader.readLine()) != null);
                addSong(line);

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    void addSong(String lineToParse){
        String[] token = lineToParse.split("/");

        Song nextSong = new Song(token[0],token[1],token[2],token[3]);
        songList.add(nextSong);
    }
}

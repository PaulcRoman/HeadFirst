package Cap16Generic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Jukebox1 {

    ArrayList<String> songList = new ArrayList<String>();

    public static void main(String[] args) {
        new Jukebox1().go();
    }

    public void go(){
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);  //Call the static Collection sort() method,then print the list again.
        System.out.println(songList); //The second ptint out is in alphabetical order
    }

    void getSongs(){
        try {

            File file = new File("D:\\Full Stack JAVA\\JavaBasics\\HeadFirst Java\\Chap1\\src\\Cap16Generic\\Songlist");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;

            while ((line= reader.readLine()) != null) {
                addSong(line);
            }


        }catch (Exception ex){
            ex.printStackTrace();;
        }


    }

    void addSong(String lineToParse){
        String[] tokens = lineToParse.split("/");
        songList.add(tokens[0]);
    }
}

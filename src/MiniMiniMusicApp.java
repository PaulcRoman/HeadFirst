import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;

public class MiniMiniMusicApp {

    public static void main(String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }

    public void play(){
        try {

            Sequencer player = MidiSystem.getSequencer();
            player.open();

            

        }catch (Exception ex){

        }
    }
}

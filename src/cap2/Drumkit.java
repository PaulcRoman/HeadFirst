package cap2;

public class Drumkit {
    boolean topHat = true;
    boolean snare = true;

    void playSnare(){
        System.out.println("bang bang ba-bang");
    }

    void playTopHat(){
        System.out.println("ding ding da-ding");
    }


}

class DrumKitTestDrive{
    public static void main(String[] args) {
        Drumkit d = new Drumkit();

        if (d.snare ==true){
            d.playSnare();
        }

        d.snare = false;

        d.playTopHat();
    }
}

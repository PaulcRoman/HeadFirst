package cap14;

import com.sun.management.GarbageCollectionNotificationInfo;

import java.io.*;

public class GameSaverTest {
    public static void main(String[] args) {
        GameCharacter one = new GameCharacter(50,"Elf",new String[]{"bow","sword","dust"});
        GameCharacter two = new GameCharacter(200,"Troll", new String[]{"bare hands","big axe"});
        GameCharacter three = new GameCharacter(120,"Magician", new String[]{"spells","invisibility"});


        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        one = null;
        two = null;
        three = null;

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
            GameCharacter oneRestore = (GameCharacter) is.readObject();
            GameCharacter twoRestore = (GameCharacter) is.readObject();
            GameCharacter threeRestore = (GameCharacter) is.readObject();

            System.out.println("One's type: "+ oneRestore.getType());
            System.out.println("Two's type: "+twoRestore.getType());
            System.out.println("Three's type: "+threeRestore.getType());

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static class GameCharacter implements Serializable {
        int power;
        String type;
        String[] weapons;

        public GameCharacter(int power, String type, String[] weapons) {
            this.power = power;
            this.type = type;
            this.weapons = weapons;
        }

        public int getPower() {
            return power;
        }

        public String getType() {
            return type;
        }

        public String getWeapons() {
            String weaponList = "";

            for (int i = 0; i <weaponList.length();i++){
                weaponList += weapons[i] + "";
            }
            return weaponList;
        }

    }
}

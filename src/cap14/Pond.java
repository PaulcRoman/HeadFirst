package cap14;

import java.awt.image.ImageProducer;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Pond implements Serializable {

//    private Duck duck = new Duck();  Duck is not Serializable and will give NotSerializableException

    public static void main(String[] args) {
        Pond myPond = new Pond();
        try {
            FileOutputStream fs = new FileOutputStream("Pond.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(myPond);
            os.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public class Duck {

    }
}

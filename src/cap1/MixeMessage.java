package cap1;

public class MixeMessage {
    public static void main(String[] args) {
        int x = 0, y = 0;

        while (x < 5) {

//            y = x - y; //00122223444
//            y = y + x;

//            y = y +2;   //0214253647
//            if (y>4){
//                y = y-1;
//            }

//            x = x +1;  //113459
//            y = y +x;

//            if (y<5){  02143648
//                x = x +1;
//                if (y<3) {
//                    x = x-1;
//
//                }
//            }
//            y = y +2;

            System.out.print(x + "" + y + "");
            x = x + 1;

        }
    }
}

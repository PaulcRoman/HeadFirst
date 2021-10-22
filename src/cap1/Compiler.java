package cap1;

public class Compiler {

    public static void main(String[] args) {
        int x = 5;
        while (x > 1) {
            x = x - 1;

            if (x < 3) {
                System.out.println("smal x"); //se afiseaza de 2 ori
            }
        }
    }

}

class Exercise1bA {
    public static void main(String[] args) {
        int x = 1;

        while (x < 10) {
            x=x+1;
            if (x > 3) {
                System.out.println("big x"); //afiseaza de 7 ori
            }
        }

    }
}

class Exercise1bC {
    public static void main(String[] args) {
        int x = 5;

        while (x > 1) {
            x = x - 1;

            if (x < 3) {
                System.out.println("smal x"); //afiseaza de 2 ori
            }
        }
    }
}

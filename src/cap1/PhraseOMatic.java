package cap1;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne={"24/7","multi-tier","30,000 foot","B-toB","win-win","front-end","web-based","pervasive","smart","six-sigma","critical-path","dynamic"};

        String[] wordLostTwo = {"empowerd","sticky","value-added","orieted","centric","distributed","clustered","branded","outside-the-box","possitioned","networked","focused","leveraged","aligned","targeted","shared","cooperative","accelerated"};

        String[] wordListThree = {"peocess","tipping-point","solution","architecture","core competicy","strategy","mind-shared","portal","space","vision","paradigm","mission"};

        int oneLength = wordListOne.length;
        int twoLength = wordLostTwo.length;
        int threLength = wordListThree.length;

        int rand1 = (int)(Math.random()*oneLength);
        int rand2 = (int)(Math.random()*twoLength);
        int rand3 = (int)(Math.random()*threLength);

        String phrase = wordListOne[rand1]+" "+wordLostTwo[rand2]+" "+wordListThree[rand3];

        System.out.println("What we need is a "+phrase);
    }
}

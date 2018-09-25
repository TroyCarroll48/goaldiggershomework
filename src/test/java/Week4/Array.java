package Week4;

public class Array {
    public static void main(String[] args) {

        String[] wordListOne = {"24/7", "Loveydovey", "snickerdoodle", "30,000", "Lovebug",
        "iphone", "lotion", "waterbootle", "#420blazeit",
                "andriod", "pen", "penci", "paper", "dynamis"};

        String[] wordListTwo = {"empowered", "honest", " charger", "headphones","cranberry",
        "phone case", "stove", "cabnets", "out-the-box", "everlasting",
        "gobbstopper", "gti", "fridge", "candle"};

        String[] wordListThree = {"process", "uzi", "glock", "boston market", "chinesefood",
        "checkers", "keys", "cup", "medicine",
                "bags", "alchol", "liddle"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int randl = (int) (Math.random() * oneLength);
        int rand2 =  (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase =  wordListOne [randl] + " " +
        wordListTwo[rand2] + " " + wordListThree[rand3] ;

        System.out.println("What we need is a " + phrase);
    }
}

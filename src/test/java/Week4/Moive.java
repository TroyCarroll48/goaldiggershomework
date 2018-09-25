package Week4;

public class Moive {

    String title;
    String genre;
    int rating;


    void playIt() {
        System.out.println("Playing the movie");
    }

    public String review(){
        return title + "wss such an interesting movie even though it only had a " + rating;
    }

    public String overall(){
        return genre + "Is the genre for any movie";
    }


}



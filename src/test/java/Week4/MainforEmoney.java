package Week4;

public class MainforEmoney {
    public static void main(String[] args) {

        Emoney manny = new Emoney("Troy","carroll",124456789,42000,"Janitor");


        manny.setBonus(800);
        manny.getBonus();
        System.out.println(manny.fullname());

        System.out.println(manny.fullpay());

        System.out.println(manny.whatyoudo());

        System.out.println(manny.paywithbonus());


    }
}

package Week4;

public class Emoney {
    private String  firstName;
    private String lastName;
    private  int socialSecurityNumber;
    private int  salary;
    private String title;
    private int bonus;

    public Emoney(String firstName, String lastName, int socialSecurityNumber, int salary, String title){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.salary = salary;
        this. title = title;
    }

    public String getFirstName(){
        return firstName;
    }
    private void setFirstName(String fN){
        this.firstName = fN;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lN){
        this.lastName = lN;
    }
    public int getSocialSecurityNumber(){
        return getSocialSecurityNumber();
    }
    public void setSocialSecurityNumber(int sSN){
        this.socialSecurityNumber = sSN;
    }

    public int getSalary(){
        return salary;
    }
    public void setSalary(int s){
        this.salary = s;
    }

    public String getTitle(){
        return title;
    }
     public void setTitle(String t){
        this.title = t;
     }

     public int getBonus(){
        return bonus;
     }
     public  void  setBonus(int b){
        this.bonus = b;
     }
     private int payCheck(){
        return salary + bonus;
     }
     public String fullname(){
        return firstName + " " +  lastName;
     }
     public String fullpay(){
        return firstName + " salary is: " + salary;
     }
     public String whatyoudo(){
        return firstName +  " Title is " + title;
     }

     public String paywithbonus(){
        return firstName + payCheck();
     }


}

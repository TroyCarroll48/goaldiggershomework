package Week4;

public class Employeeclass {

    private String firstName;
    private String  lastName;
    private int wage;
    private int hours;
    public String title;

    public Employeeclass(String firstName, String lastName, int wage, int hours, String title){
        this.firstName = firstName;
        this.lastName = lastName;
        this.wage = wage;
        this.hours = hours;
        this.title = title;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String f ){
        this.firstName = f;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastname(String l){
        this.lastName = l;
    }
    public int getWage(){
        return wage;
    }
    public void setWage(int w){
        this.wage = w;
    }

    public int getHours(){
        return hours;
    }
    public void setHours(int h){
        this.hours = h;

    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String t){
        this.title = t;
    }

    public String Paycheck(){
        return firstName + " made " + (wage * hours) + " This week";
    }
     public String name(){
        return " Employees Full Name : " + firstName + lastName;
     }

     public String job(){
        return " Employee's Title is : " + title;
    }

}

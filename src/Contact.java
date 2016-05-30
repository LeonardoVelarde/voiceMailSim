/*
 * Created by levelarde on 20-04-16.
 */
public class Contact {
    private String name;
    private String number;
    Contact(String name, String number){
        this.name = name;
        this.number = number;
    }
    public String getName(){
        return name;
    }

    public String getNumber(){
        return number;
    }

    public String getNumberAndName(){
        return name + " " + number;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNumber(String number){
        this.number = number;
    }
}

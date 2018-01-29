package tize.com.example.demo;
//This is the parent class for different animals
public class Animal {

    private String name;
    //this is the default constructor
    public Animal(){
        System.out.println("An animal has been created ... ");
    }
    //this is an overloaded constructor
    public Animal (String message){
        System.out.println(message);
    }

    public String getName(){
        return name;
    }
    public void setName(String value){
        name = value;
    }

    public String eat(){
        return "An animal eats ... ";
    }
    public String sleep(){
        return "An animal sleeps ...";
    }
}
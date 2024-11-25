package Week1;

public class Person {
    private String name;
    private String surname;
    private int age;

    /**
     * Constructor
     * @param name : name of the person
     */
    public Person(String name){
        this.name = name;
    }

    public void displayName(){
        System.out.println("Name : " + name);
    }

    //setters
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setAge(int age){
        this.age = age;
    }
    //getters
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Suneth");
        Person p2 = new Person("Nimal");

        p1.setSurname("Nawoda");
        p1.setAge(23);
        p2.setSurname("Kumara");
        p2.setAge(34);

        System.out.println(p1.getName() + " " + p1.getSurname() + "," + p1.getAge() + " years old!");
        System.out.println(p2.getName() + " " + p2.getSurname() + "," + p2.getAge() + " years old!");
    }
}

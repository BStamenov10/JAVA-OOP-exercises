public class Person {
    String name;
    int age;

    Person(String name, int age){

        this.name = name;
        this.age = age;
    }
    void getName(){
        System.out.println("Your name is: "+this.name);
    }
    void getAge(){
        System.out.println("Your age is: "+this.age);
    }
}

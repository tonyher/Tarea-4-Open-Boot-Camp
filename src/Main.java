public class Main {
    public static void main(String[] args) {

    }
}

abstract class Person{
    int age;
    String name;
    int phoneNumber;
}

class client extends Person{
    int credit;

    public void Show(){
        System.out.println ("Your name: " + name);
        System.out.println ("Your age: " + age);
        System.out.println ("Your phone number: " + name);
        System.out.println ("Your credit: " + name);
    }
}


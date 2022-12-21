public class Main {
    public static void main(String[] args) {

        Client client = new Client();

        Worker worker = new Worker();

        System.out.println("Client class");
        client.Show("Tony", 20, 8993272,292);

    }

}

abstract class Person{
    int age;
    String name;
    int phoneNumber;


}

class Client extends Person{
    int credit;


    public void Show(String name, int age, int phoneNumber, int credit){
        System.out.println ("Your name: " + name);
        System.out.println ("Your age: " + age);
        System.out.println ("Your phone number: " + phoneNumber);
        System.out.println ("Your credit: " + credit);
    }
}

final class Worker extends Person{

    int salary;

    public void Show(String name, int age, int phoneNumber, int salary){
        System.out.println ("Your name: " + name);
        System.out.println ("Your age: " + age);
        System.out.println ("Your phone number: " + phoneNumber);
        System.out.println ("Your salary: " + salary);
    }

}



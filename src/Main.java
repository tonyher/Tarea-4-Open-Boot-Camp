public class Main {
    public static void main(String[] args) {

        //Object Instance

        Client client = new Client();

        Worker worker = new Worker();


        // Call the methods with its parameters
        System.out.println("Client class");
        client.Show("Tony", 20, 8993272,292);

        System.out.println("Worker class");
        worker.Show("Marcelo", 21, 8543576,1092);

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



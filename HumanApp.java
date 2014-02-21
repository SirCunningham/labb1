package labb1;

public class HumanApp {

    public static void main(String[] args) {
        Human putte = new Human(25, "Putte");
        System.out.println("getName() -> " + putte.getName());
        System.out.println("getAge() -> " + putte.getAge());
        System.out.println("toString() -> " + putte.toString());
        System.out.println(putte);

        Human hum = new Human();
        System.out.println(hum);
    }
}
package labb1;

public class Human implements Comparable<Human> {

    private int age;
    private String name;
    private static String[] nameArray = {"Albert", "Bertil", "Cecilia",
        "Dennis", "Emma", "Ferdninand", "Gunilla", "Hilbert", "Ivar", "Joakim",
        "Klara", "Lena", "Martin", "Niklas", "Olle", "Petra", "Quisling",
        "Robert", "Sandra", "Tove", "Ulla", "Viktor", "Willam", "Xavier",
        "Yngve", "Zack", "Åke", "Ängla", "Örjan"};

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human(String name, int age) {
        this(age, name);
    }

    public Human() {
        this((int) (Math.random() * 100),
                nameArray[(int) (Math.random() * nameArray.length)]);
    }

    public String toString() {
        return String.format("namn: %s, ålder: %d år", name, age);
    }

    public int compareTo(Human hum) {
        return age - hum.getAge();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
package labb1;

public class Fysiker extends Human {

    private int year;

    public Fysiker(int age, String name, int year) {
        super(age, name);
        if (year < 1932) {
            this.year = 1932;
        } else if (year > 2013) {
            this.year = 2013;
        } else {
            this.year = year;
        }
        if (age < 15 + 2013 - year) {
            setAge(15 + 2013 - year);
        }
    }

    public Fysiker(String name, int age, int year) {
        this(age, name, year);
    }

    public Fysiker() {
        year = (int) (Math.random() * (2013 - 1932) + 1932);
        if (getAge() < 15 + 2013 - year) {
            setAge((int) (Math.random() * (100 - (15 + 2013 - year))
                    + 15 + 2013 - year));
        }
    }

    public String toString() {
        return String.format("%s, började fysik F%s", super.toString(),
                String.valueOf(year).substring(2, 4));
    }

    public int getYear() {
        return year;
    }

    public int compareTo(Fysiker fys) {
        if (getAge() == fys.getAge()) {
            return year - fys.getYear();
        } else {
            return getAge() - fys.getAge();
        }
    }
}
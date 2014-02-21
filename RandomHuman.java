package labb1;

public class RandomHuman {

    public static void main(String[] args) {
        Human[] humanArray = new Human[15];
        for (int i = 0; i < humanArray.length; i++) {
            humanArray[i] = new Human();
        }
        for (Human hum : humanArray) {
            System.out.println(hum);
        }

        Human hum1 = new Human();
        Human hum2 = new Human();
        int rel = hum1.compareTo(hum2);
        if (rel < 0) {
            System.out.printf("%s, som är %d år, är yngre än %s, som är %d år.\n",
                    hum1.getName(), hum1.getAge(), hum2.getName(), hum2.getAge());
        } else if (rel == 0) {
            System.out.printf("%s och %s är båda %d år.\n", hum1.getName(),
                    hum2.getName(), hum1.getAge());
        } else {
            System.out.printf("%s, som är %d år, är yngre än %s, som är %d år.\n",
                    hum2.getName(), hum2.getAge(), hum1.getName(), hum1.getAge());
        }
    }
}
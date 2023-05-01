public class Animal {

    private static int dogCount;
    private static int catCount;

    void run() {
        System.out.println();
    }

    void swim() {
        System.out.println();
    }

    public static int getDogCount() {
        return dogCount;
    }

    static int getCatCount() {
        return catCount;
    }

    static void incrementDogCount() {
        dogCount++;
    }

    static void incrementCatCount() {
        catCount++;
    }
}
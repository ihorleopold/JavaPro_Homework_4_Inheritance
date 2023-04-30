public class Animal {

    private static int dogCount;
    private static int catCount;

    public void run() {
        System.out.println();
    }

    void swim() {
        System.out.println();
    }

    public static int getDogCount() {
        return dogCount;
    }

    public static int getCatCount() {
        return catCount;
    }

    protected static void incrementDogCount() {
        dogCount++;
    }

    protected static void incrementCatCount() {
        catCount++;
    }
}
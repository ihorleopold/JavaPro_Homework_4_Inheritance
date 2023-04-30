public class Cat extends Animal {

    public void run() {
        System.out.println("Cat is running");
    }

    void swim() {
        System.out.println("Cat cannot swim");
    }

    public void catRun(int runLength) {
        if (runLength <= 200) {
            System.out.println("Cat ran " + runLength + " meters");
        } else {
            System.out.println("Cat run distance limit (200m) exceeded");
        }
    }

}
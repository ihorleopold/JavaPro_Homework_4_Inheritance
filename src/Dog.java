public class Dog extends Animal {

    public void run() {
        System.out.println("Dog is running");
    }

    void swim() {
        System.out.println("Dog is swimming");
    }

    void dogRun(int runLength) {
        if (runLength <= 500) {
            System.out.println("Dog ran " + runLength + " meters");
        } else {
            System.out.println("Dog run distance limit (500m) exceeded");
        }
    }

    void dogSwim(int swimLength) {
        if (swimLength <= 10) {
            System.out.println("Dog swam " + swimLength + " meters");
        } else {
            System.out.println("Dog swim distance limit exceeded");
        }
    }

}
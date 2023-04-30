public class Main {
    public static void main(String[] args) {

        Dog dogParticipant1 = new Dog();
        dogParticipant1.dogRun(510);
        dogParticipant1.dogSwim(10);
        Animal.incrementDogCount();

        Dog dogParticipant2 = new Dog();
        dogParticipant2.dogRun(250);
        dogParticipant2.dogSwim(5);
        Animal.incrementDogCount();

        Cat catParticipant1 = new Cat();
        catParticipant1.catRun(100);
        Animal.incrementCatCount();

        Cat catParticipant2 = new Cat();
        catParticipant2.catRun(250);
        Animal.incrementCatCount();

        System.out.println("Number of created instances of Dog: " + Animal.getDogCount());
        System.out.println("Number of created instances of Cat: " + Animal.getCatCount());

    }
}
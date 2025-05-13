public class Dog extends Animal implements Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void play() {
        System.out.println("Playing fetch");
    }
}

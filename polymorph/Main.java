public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("Generic animal");
        myAnimal.makeSound();

        Dog myDog = new Dog("Rover");
        myDog.makeSound();
        myDog.play();

        Vehicle myCar = new Car();
        myCar.move();
    }
}


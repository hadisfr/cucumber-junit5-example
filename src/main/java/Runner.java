public class Runner {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat =  new Cat();

        System.out.println("Cat says " + cat.makeSound());
        System.out.println("Dog says " + dog.makeSound());
    }
}

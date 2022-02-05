import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @Test
    void testCat() {
        Animal cat = new Cat();
        assertEquals("Mew!", cat.makeSound());
    }

    @Test
    void testDog() {
        Animal dog = new Dog();
        assertEquals("Haap!", dog.makeSound());
    }
}
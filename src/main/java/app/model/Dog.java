package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    public Dog() {
        System.out.println("Gaugh");
    }

    @Override
    public String toString() {
        return "Im a Dog";
    }
}
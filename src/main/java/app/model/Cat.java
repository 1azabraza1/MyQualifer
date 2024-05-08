package app.model;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    public Cat() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Im a Cat";
    }
}

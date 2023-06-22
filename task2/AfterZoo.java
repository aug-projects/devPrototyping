public class Zoo {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("Cow", DietType.HERBIVORE));
        animals.add(new Animal("Dog", DietType.OMNIVORE));
        animals.add(new Animal("Lion", DietType.CARNIVORE));

        for (Animal animals : animal) {
            animal.toString();
        }
    }
}

class Animal {
    protected String name;
    protected DietType dietType;

    public Animal(String name, DietType dietType) {
        this.name = name;
        this.dietType = dietType;
    }

    public boolean isSafety() {
        return switch (dietType)){
            case DietType.CARNIVORE, DietType.CARNIVORE -> true;
            case DietType.HERBIVORE -> false;
        }
    }

    @Override
    public String toString() {
        return name + " is " + (this.isSafety() ? "Safe" : "Unsafe");
    }

    public enum DietType {
        HERBIVORE,
        CARNIVORE,
        OMNIVORE
    }
}

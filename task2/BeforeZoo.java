public class Zoo {
    public static void main(String[] args) {
        List<Animal> a = new ArrayList<Animal>();
        a.add(new Animal("Cow", "herbivore"));
        a.add(new Animal("Dog", "omnivore"));
        a.add(new Animal("Lion", "carnivore"));

        for (Animal animal : animals) {
            animal.getSafety();
        }
    }
}


class Animal {
    String safety;
    String name;
    String diet;
    public Animal(String name, String diet) {
        this.name = name;
        safety = "safe";
        this.diet = diet;
    }
    public String getSafety() {
        if (diet.equals("carnivore")) {
            safety = "Safe";
        }
        if (diet.equals("herbivore")) {
            safety = "Unsafe";
        }
        if (diet.equals("omnivore")) {
            safety = "Kind of Safe";
        }

        System.out.println(this.name + "is " + safety);
        return safety;
    }
}

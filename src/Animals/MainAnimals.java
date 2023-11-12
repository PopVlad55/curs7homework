package Animals;

public class MainAnimals {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal mouse = new Mouse();
        Animal chicken = new Chicken();
        Animal duck = new Duck();

        System.out.println(cat.walk());
        System.out.println(cat.talk());
        System.out.println(cat.eat());

        System.out.println(dog.walk());
        System.out.println(dog.talk());
        System.out.println(dog.eat());

        System.out.println(mouse.walk());
        System.out.println(mouse.talk());
        System.out.println(mouse.eat());

        System.out.println(chicken.walk());
        System.out.println(chicken.talk());
        System.out.println(chicken.eat());

        System.out.println(duck.walk());
        System.out.println(duck.talk());
        System.out.println(duck.eat());
    }
}

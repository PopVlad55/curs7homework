package Animals;

class Dog implements Animal {

    @Override
    public String walk() {
        return "dog-walking";
    }

    @Override
    public String talk() {
        return "woof";
    }

    @Override
    public String eat() {
        return "dog-eating";
    }
}

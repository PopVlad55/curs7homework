package Animals;

class Cat implements Animal {

    @Override
    public String walk() {
        return "cat-walking";
    }

    @Override
    public String talk() {
        return "meow";
    }

    @Override
    public String eat() {
        return "cat-eating";
    }
}

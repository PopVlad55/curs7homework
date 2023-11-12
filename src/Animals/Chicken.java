package Animals;

class Chicken implements Animal {

    @Override
    public String walk() {
        return "Chicken-walking";
    }

    @Override
    public String talk() {
        return "Cluck";
    }

    @Override
    public String eat() {
        return "Chicken-eating";
    }
}

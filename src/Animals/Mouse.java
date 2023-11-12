package Animals;

class Mouse implements Animal {

    @Override
    public String walk() {
        return "Mouse-walking";
    }

    @Override
    public String talk() {
        return "Squeak";
    }

    @Override
    public String eat() {
        return "Mouse-eating";
    }
}

package Animals;

class Duck implements Animal {


    @Override
    public String walk() {
        return "Duck-walking";
    }

    @Override
    public String talk() {
        return "Quack";
    }

    @Override
    public String eat() {
        return "Duck-eating";
    }
}

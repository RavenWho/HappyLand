package backend.People;

public class Investor {
    private final int STARTER_BUDGET = 15000;
    private String name;
    private int age;
    private int budget;


    public Investor(String name, int age) {
        this.name = name;
        this.age = age;
        budget = STARTER_BUDGET;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

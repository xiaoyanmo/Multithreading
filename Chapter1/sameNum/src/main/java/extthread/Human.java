package extthread;

public class Human {
    private String name;
    private int age;
    private People people;

    public Human() {
    }

    public Human(People people) {
        this.people = people;
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

package classesandobjects.practice.dog;

public class Dog {
    private String name;
    private String sex;
    private String mother;
    private String father;

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Dog(String name, String sex, String mother, String father) {
        this.name = name;
        this.sex = sex;
        this.mother = mother;
        this.father = father;
    }

    public String fathersName() {
        if (father == null){
            return "Unknown";
        } else {
        return father;}
    }

    public boolean hasSameMotherAs(Dog otherDog){
        return mother.equals(otherDog.mother);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}

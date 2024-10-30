import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person implements Serializable {
    static final long serialVersionUID = 1L;
    private String name;
    private int year;
    private Person mother;
    private Person father;
    private List<Person> childrenList;

    public Person(String name, int year) {
        this.name = name;
        this.year = year;
        this.childrenList = new ArrayList<>();
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return year;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public List<Person> getChildrenList() {
        return childrenList;
    }

    public void addChild(Person child) {
        this.childrenList.add(child);
    }

}

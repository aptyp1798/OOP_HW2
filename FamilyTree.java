import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FamilyTree implements Serializable {
    static final long serialVersionUID = 1L;
    private List<Person> people;

    public FamilyTree() {
        this.people = new ArrayList<>();
    }

    public Person findPersonByName(String name) {
        for (Person person : people) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    public List<Person> getPeople() {
        return people;
    }

    public List<Person> getChildren(Person parent) {
        return parent.getChildrenList();
    }

    public void addPerson(Person person) {
        this.people.add(person);
    }

    public List<Person> getBrotherSister(Person person) {
        ArrayList<Person> brotherSister = new ArrayList<>();
        brotherSister.addAll(person.getFather().getChildrenList());
        brotherSister.remove(person);
        return brotherSister;
    }
}

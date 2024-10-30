import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FamilyTree familyTree = new FamilyTree();

        Person john = new Person("John", 1950);
        Person alis = new Person("Alis", 1990);
        Person boy = new Person("Boy", 1995);
        Person mary = new Person("Mary", 1954);

        alis.setFather(john);
        alis.setMother(mary);
        boy.setFather(john);
        boy.setMother(mary);

        john.addChild(boy);
        john.addChild(alis);
        mary.addChild(boy);
        mary.addChild(alis);

        familyTree.addPerson(john);
        familyTree.addPerson(mary);
        familyTree.addPerson(alis);
        familyTree.addPerson(mary);

        FileOperation fsw = new FileOperation();
        try {
            fsw.saveToFile(familyTree, "File.txt");
            System.out.println("Запись в файл успешна");
        } catch (IOException e) {
            e.printStackTrace();
        }

        FamilyTree loadedFamilyTree = null;
        try {
            loadedFamilyTree = fsw.loadFromFile("File.txt");
            System.out.println("Файл прочтен");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (loadedFamilyTree != null) {
            for (Person person : loadedFamilyTree.getPeople()) {
                System.out.println("Loaded person: " + person.getName() + ", " + "birthday: " + person.getDay());
            }
        }
    }
}

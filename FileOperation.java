import java.io.*;

public class FileOperation implements FileSaveWriter{

    @Override
    public void saveToFile(FamilyTree familyTree, String fileName) throws IOException {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
            out.writeObject(familyTree);
            out.close();
    }

    @Override
    public FamilyTree loadFromFile(String fileName) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
        return (FamilyTree) in.readObject();
    }
}

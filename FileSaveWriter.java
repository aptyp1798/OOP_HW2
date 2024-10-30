import java.io.FileNotFoundException;
import java.io.IOException;

public interface FileSaveWriter {

    void saveToFile(FamilyTree familyTree, String fileName) throws IOException;

    FamilyTree loadFromFile(String fileName) throws IOException, ClassNotFoundException;
}

import java.io.File;
import java.util.List;
import java.util.Optional;

public class FileRepo<T extends Identifiable> {
    private List<T> collection;
    // private String path = getFromConfig();
    private FileHandler storage;

    public FileRepo(Class<T> tClass) {
        String fileName = tClass.getCanonicalName() + ".ser";
        System.out.println("Accessing data from " + fileName);
        System.out.println();
        storage = new FileHandler(new File(fileName));
        collection = (List<T>) storage.restore();
    }

    public T save(T t) {
        collection.add(t);
        storage.backup(collection);
        return t;
    }

    public T getById(int id) {
        Optional<T> t = collection.stream().filter((st) -> st.getId() == id).findFirst();
        if (t != null && t.get() != null && t.get().getId() != 0) {
            return t.get();
        }
        return null;
    }

    public List<T> findAll() {
        return collection;
    }

    public Long count() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }

    public void deleteById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }
}

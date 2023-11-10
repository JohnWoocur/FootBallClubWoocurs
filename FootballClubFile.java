import java.io.File;
import java.util.List;
import java.util.Optional;

public class FootballClubFile {
    private List<FootballClub> FootballClubs;
    // private String path = getFromConfig();
    private FileHandler storage;

    
    public FootballClubFile() {
        String fileName = "./footballclubs.txt";
        storage = new FileHandler(new File(fileName));
        FootballClubs = (List<FootballClub>) storage.restore();
    }

    public FootballClub save(FootballClub FootballClub) {
        FootballClubs.add(FootballClub);
        storage.backup(FootballClubs);
        return FootballClub;
    }

    public FootballClub getById(Integer id) {
        Optional<FootballClub> FootballClub = FootballClubs.stream().filter((st) -> st.getId() == id).findFirst();
        if (FootballClub != null && FootballClub.get() != null && FootballClub.get().getId() != 0) {
            return FootballClub.get();
        }
        return null;
    }

    public List<FootballClub> findAll() {
        return FootballClubs;
    }

    public Long count() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }

    public void deleteById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }
}

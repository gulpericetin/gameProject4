import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class GameRepository implements DataRepository<Game> {
    List<Game> games =new ArrayList<>();

    @Override
    public List<Game> getAll() {
        return games;
    }

    @Override
    public void add(Game entity) {
        games.add(entity);
        System.out.println("Game added succes");
    }

    @Override
    public void update(Game entity) {
        System.out.println("Game update succes");

    }

    @Override
    public void delete(Game entity) {
        games.remove(entity);
        System.out.println("Game delete succes");

    }
}

import java.util.List;

public interface GameService {
    List<Game> getAll();
    void add(Game game);
    void update(Game game);
    void delete(Game game);
}

import java.util.List;

public interface PlayerService {
    List<Player> getAll();
    void add(Player player);
    void update(Player player);
    void delete(Player player);
}

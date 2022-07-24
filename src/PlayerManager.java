import java.util.List;

public class PlayerManager implements PlayerService{

    private DataRepository dataRepository;
    private Mernis mernis;

    public PlayerManager(DataRepository dataRepository, Mernis mernis) {
        this.dataRepository = dataRepository;
        this.mernis = mernis;
    }


    @Override
    public List<Player> getAll() {
        return dataRepository.getAll();
    }

    @Override
    public void add(Player player) {
        if (mernis.isPlayerValid(player)) {
            dataRepository.add(player);
        }
    }

    @Override
    public void update(Player player) {
        dataRepository.update(player);
    }

    @Override
    public void delete(Player player) {
        dataRepository.delete(player);
    }
}

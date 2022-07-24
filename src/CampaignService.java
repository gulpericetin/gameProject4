import java.util.List;

public interface CampaignService {

    List<Campaign> getAll();
    void add(Campaign campaign);
    void update(Campaign campaign);
    void delete(Campaign campaign);
}

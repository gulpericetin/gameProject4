import java.util.ArrayList;
import java.util.List;


public class CampaignRepository implements DataRepository<Campaign> {
    List<Campaign> campaigns = new ArrayList<>();
    @Override
    public List<Campaign> getAll() {
        return campaigns;
    }

    @Override
   public void add(Campaign entity) {
        campaigns.add(entity);
        System.out.println("Campaign added succesfully");

    }

    @Override
    public void update(Campaign entity) {
        System.out.println("Campaign updated succesfully");
    }

    @Override
    public void delete(Campaign entity) {
        campaigns.remove(entity);
        System.out.println("Campaign deleted succesfully");

    }
}

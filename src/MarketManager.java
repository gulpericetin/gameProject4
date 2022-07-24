public class MarketManager {
    public void market(Game game, Campaign campaign, Player player) {
        game.setDiscountedPrice((1-campaign.getDiscountedRate())*game.getPrice());
        System.out.println(player.getFirstName()+" "+player.getLastName()+" has bought "+game.getName());
        System.out.println(game.getPrice());
        System.out.println(game.getDiscountedPrice());
    }
}

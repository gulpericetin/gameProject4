import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        GameManager gameManager = new GameManager(new GameRepository());
        Game game1 = new Game(1, "league of legends", 1000);
        Game game2 = new Game(2, "Pubg", 2000);
        gameManager.add(game1);
        gameManager.add(game2);

        CampaignManager campaignManager = new CampaignManager(new CampaignRepository());
        Campaign campaign1 = new Campaign(1, "level discount", 0.50);
        Campaign campaign2 = new Campaign(1, "season discount", 0.30);
        campaignManager.add(campaign1);
        campaignManager.add(campaign2);


        Mernis mernis = new MerniseAdapter();
        PlayerManager playerManager = new PlayerManager(new PlayerRepository(),new MerniseAdapter());
        Player player1 = new Player(1, "Gülperi", "Çetin", "9387487487827", LocalDate.parse("2000-11-02"));
        Player player2 = new Player(2, "Engin", "Demiroğ", "8374774774790", LocalDate.parse("1995-02-01"));
        playerManager.add(player1);
        playerManager.add(player2);
    }

}

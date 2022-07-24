public class MerniseAdapter implements Mernis{

    @Override
    public boolean isPlayerValid(Player player) {
        System.out.println(player.getFirstName()+ " "
                +player.getLastName()+ " " +player.getNationalIdentity()+ " "
                +player.getBirthDate().getYear()+ " Verified with Mernis.");
        return true;
    }
}

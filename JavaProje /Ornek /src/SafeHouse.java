public class SafeHouse extends NormalLoc {

    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
        
    }
    public boolean getLoc() {
      player.setHealthy(player.getrHealthy());
      System.out.println("Eski Halinize Döndünüz...");
      System.out.println("Güvenli Evdesiniz...");
      return true;
    }
}

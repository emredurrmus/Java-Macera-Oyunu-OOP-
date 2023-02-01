import java.util.Scanner;

public class Game {
  Player player;
  Location location;
  Scanner scan = new Scanner(System.in);

  public void login() {
    //Scanner scan = new Scanner(System.in);
    System.out.println("Macera Oyununa Hoşgeldiniz");
    System.out.print("Oyuna Başlamadan Önce İsminizi Giriniz: a");
    // String playerName = scan.nextLine();
    player = new Player("a");
    player.selectCha();
    start();

  }

  public void start() {
    while (true) {
      System.out.println("");
      System.out.println("============");
      System.out.println("");
      System.out.println("Eylem Gerçekleştireceğiniz Yeri Seçiniz");
      System.out.println("1 - Güvenli Ev");
      System.out.println("2 - Mağara");
      System.out.println("3 - Orman");
      System.out.println("4 - Nehir");
      System.out.println("5 - Mağaza");
      int selLoc = scan.nextInt();

      while (selLoc < 0 || selLoc > 5) {
        System.out.println("Lütfen geçerli bir sayı giriniz ");
        selLoc = scan.nextInt();

      }
      switch (selLoc) {
        case 1:

          location = new SafeHouse(player);
          break;

        case 2:
          location = new Cave(player);
          break;
        case 3:
          location = new Forest(player);
          break;
        case 4:
          location = new River(player);
          break;
        case 5:
          location = new ToolStore(player);
          break;

        default:

          location = new SafeHouse(player);
          break;

      }
      if (location.getClass().getName().equals("SafeHouse")) {
        if (player.getInv().isFirewood() && player.getInv().isFood() && player.getInv().isWater()) {

          System.out.println("Tebrikler!! Oyunu Kazandınız....");
          System.out.println("Oynadığınız İçin Teşekkür Ederiz");
          break;
        }

      }

      if (!location.getLoc()) {
        System.out.println("Oyun Bitti!");
        break;
      }

    }

  }

}
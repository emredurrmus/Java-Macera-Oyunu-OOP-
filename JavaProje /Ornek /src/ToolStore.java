public class ToolStore extends NormalLoc {

    public ToolStore(Player player) {
        super(player, "Magaza");

    }

    public boolean getLoc() {

        System.out.println("Para:" + player.getMoney());
        System.out.println("1- Silahlar ");
        System.out.println("2- Zırhlar");
        System.out.println("3- Çıkış");
        System.out.println("Seçiminiz:");
        int selTool = scan.nextInt();
        int selItemID;
        switch (selTool) {
            case 1:
                selItemID = weaponMenu();
                buyWeapon(selItemID);
                break;
            case 2:
                selItemID = armorMenu();
                buyArmor(selItemID);

                break;
            default:
                break;
        }
        return true;
    }

    public int armorMenu() {
        System.out.println("1. Hafif\t <Engelleme:1 - Para: 15>");
        System.out.println("2. Orta\t  <Engelleme:3 - Para: 25>");
        System.out.println("3. Ağır\t  <Engelleme:5 - Para: 40>");
        System.out.println("4. Cıkıs");
        System.out.println("Silah Seciniz: ");
        int selArmorID = scan.nextInt();
        return selArmorID;
    }

    public void buyArmor(int itemID) {
        int avoid = 0, price = 0;
        String aName = null;
        switch (itemID) {
            case 1:
                avoid  = 2;
                aName = "Hafif Zırh";
                price = 15;
                break;

            case 2:
                avoid = 3;
                aName = "Orta Zırh";
                price = 25;
                break;

            case 3:
                avoid = 7;
                aName = "Ağır Zırh";
                price = 40;
                break;

            case 4:
                System.out.println("Cıkış Yapılıyor...");
                break;

            default:
                System.out.println("Gecersiz İslem !");
                break;
        }

        if (price > 0) {
            if (player.getMoney() >= price) {
                player.getInv().setArmor(avoid);
                player.getInv().setaName(aName);
                player.setMoney(player.getMoney() - price);
                System.out.println(aName + "Satın Aldınız, Engellenen Hasar:" + player.getInv().getArmor());
                System.out.println("Kalan Bakiye" + player.getMoney());
            } else {
                System.out.println("Bakiye Yetersiz !");

            }
        }

    }

    public int weaponMenu() {
        System.out.println("1. Tabanca\t <Para: 25 - Hasar: 2>");
        System.out.println("2. Kılıc\t <Para: 35 - Hasar: 3>");
        System.out.println("3. Tüfek\t <Para: 45 - Hasar: 7>");
        System.out.println("4. Cıkıs");
        System.out.println("Silah Seciniz: ");
        int selWeaponID = scan.nextInt();
        return selWeaponID;
    }

    public void buyWeapon(int itemID) {
        int damage = 0, price = 0;
        String wName = null;
        switch (itemID) {
            case 1:
                damage = 2;
                wName = "Tabanca";
                price = 25;
                break;

            case 2:
                damage = 3;
                wName = "Kılıc";
                price = 35;
                break;

            case 3:
                damage = 7;
                wName = "Tüfek";
                price = 45;
                break;

            case 4:
                System.out.println("Cıkış Yapılıyor...");
                break;

            default:
                System.out.println("Gecersiz İslem !");
                break;
        }

        if (price > 0) {
            if (player.getMoney() > price) {
                player.getInv().setDamage(damage);
                player.getInv().setwName(wName);
                player.setMoney(player.getMoney() - price);
                System.out.println(wName + "Satın Aldınız, Önceki Hasar:" + player.getDamage()
                        + "Şimdiki Hasar:" + player.getTotalDamage());
                System.out.println("Kalan Bakiye" + player.getMoney());
            } else {
                System.out.println("Bakiye Yetersiz !");

            }
        }
    }

}

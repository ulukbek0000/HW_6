public class Main {
    public static void main(String[] args) {
        Weapon SWORD = new Weapon(WeaponType.SWORD, "Excalibur");
        Weapon AXE = new Weapon(WeaponType.AXE, "Gold Axe");
        Weapon BOW = new Weapon(WeaponType.BOW, "Bone Bow");

        Boss boss = new Boss(100, 50, SWORD);
        System.out.println("Boss Info: \n" + boss.printInfo());

        Skeleton skeleton1 = new Skeleton(100, 50, BOW, 20);
        Skeleton skeleton2 = new Skeleton(100, 50, AXE, 50);
        System.out.println("SKELETON INFO: \n" + skeleton1.printInfo());
        System.out.println("SKELETON2 INFO: \n" + skeleton2.printInfo());
    }
}
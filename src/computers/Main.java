package computers;

public class Main {
    public static void main(String[] args) {
        LenovoThinkBook13 lenovoThinkBook13 = new LenovoThinkBook13();
        MacBookAir macBookAir = new MacBookAir();
        Computer[] computers = {lenovoThinkBook13, macBookAir};
        ComputerCatalog computerCatalog = new ComputerCatalog(computers);
        computerCatalog.displayCatalog();
    }
}

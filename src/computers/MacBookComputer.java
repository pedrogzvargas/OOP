package computers;

public abstract class MacBookComputer implements Computer{
    @Override
    public String brand() {
        return "Apple";
    }
    abstract String getReleaseYear();
}

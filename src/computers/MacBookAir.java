package computers;

public class MacBookAir extends MacBookComputer{

    @Override
    public String screenResolution() {
        return "7680 × 4320";
    }

    @Override
    public String processor() {
        return "intel core i5-12700";
    }

    @Override
    String getReleaseYear() {
        return "2017";
    }
}

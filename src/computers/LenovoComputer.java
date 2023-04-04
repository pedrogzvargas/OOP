package computers;

public abstract class LenovoComputer implements Computer{
    @Override
    public String brand() {
        return "Lenovo";
    }
    public String getBackpack(){
        return "Mochila Lenovo casual para equipos portátiles de 39,6 cm (15,6) B210";
    }
}

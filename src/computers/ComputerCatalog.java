package computers;

public class ComputerCatalog {
    Computer[] computers;
    public ComputerCatalog(Computer[] computers){
        this.computers = computers;
    }

    public void displayCatalog(){
        for (Computer computer: this.computers){
            System.out.println(computer.brand());
            System.out.println(computer.screenResolution());
            System.out.println(computer.processor());
        }
    }
}

package carcomponents;

public class Engine {
    String engineSize;
    String HP;

    public Engine(String engineSize, String HP){
        this.engineSize = engineSize;
        this.HP = HP;
    }
    public String canStart(){
        return "Engine started";
    }
    public String canStop(){
        return "Engine stopped";
    }
}

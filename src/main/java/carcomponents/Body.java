package carcomponents;

public class Body {
    String colour;
    String material;
    Boolean damaged;

    public Body(String colour, String material, boolean damaged){
        this.colour = colour;
        this.material = material;
        this.damaged = damaged;
    }
    public boolean canBeDamaged(){
        return this.damaged = true;
    }
    public boolean canBeFixed(){
        return this.damaged = false;
    }
}

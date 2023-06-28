package carcomponents;

public class Windows {
    boolean tinted;
    boolean open;
    boolean damaged;

    public Windows(boolean tinted, boolean open, boolean damaged){
        this.tinted = tinted;
    }
    public boolean canOpen(){
        return this.open = true;
    }
    public boolean canClose(){
        return this.open = false;
    }
    public boolean canBeDamaged(){
        return this.damaged = true;
    }
    public boolean canCBeFixed(){
        return this.damaged = false;
    }
    public boolean getTinted(){
        return tinted;
    }

}

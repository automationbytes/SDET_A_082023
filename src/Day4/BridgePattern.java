package Day4;

interface bridgeColor{
    void paintColor();
}

class RedColor implements bridgeColor{
    @Override
    public void paintColor() {
        System.out.println("Painting red color");
    }
}

abstract class bridgeShape{
    protected bridgeColor color;
    public bridgeShape(bridgeColor color){
        this.color =  color;
    }
    abstract void draw();
}

class bCircle extends bridgeShape{
    bCircle(bridgeColor color){
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Drwaing circle");
        color.paintColor();
    }
}


public class BridgePattern {
    public static void main(String[] args) {
        bridgeShape redcirle = new bCircle(new RedColor());
        redcirle.draw();
    }
}

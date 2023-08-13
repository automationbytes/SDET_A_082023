package Day4;


interface shape{
    void draw();
}

class square implements shape{

    @Override
    public void draw() {
        System.out.println("To draw Square");
    }
}


class rectangle implements shape{

    @Override
    public void draw() {
        System.out.println("To draw Rectangle");
    }
}

class triangle implements shape{

    @Override
    public void draw() {
        System.out.println("To draw Triangle");
    }
}
interface paint{
    void input();
}

class pencil implements paint{

    @Override
    public void input() {
        System.out.println("Pencil");
    }
}


class pen implements paint{

    @Override
    public void input() {
        System.out.println("pen");
    }
}

class sketch implements paint{

    @Override
    public void input() {
        System.out.println("sketch");
    }
}

abstract class AbstractFactory{
    abstract paint getpaint(String paint);
    abstract shape getshape(String shape);
}

class shapeFac extends AbstractFactory{
    @Override
    paint getpaint(String paint) {
        return null;
    }

    public shape getshape(String shapeType){
        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("Square")){
            return new square();
        }
        else if(shapeType.equalsIgnoreCase("Rectangle")){
            return new rectangle();
        }
        else if(shapeType.equalsIgnoreCase("Triangle")){
            return new triangle();
        }
        return null;
    }
}

class paintFac extends AbstractFactory{

    public paint getpaint(String paint){
        if(paint == null){
            return null;
        }

        if(paint.equalsIgnoreCase("pen")){
            return new pen();
        }
        else if(paint.equalsIgnoreCase("pencil")){
            return new pencil();
        }
        else if(paint.equalsIgnoreCase("sketch")){
            return new sketch();
        }
        return null;
    }


    @Override
    shape getshape(String shape) {
        return null;
    }
}


class FactoryProducer{
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Shape")){
            return new shapeFac();
        }
        else if(choice.equalsIgnoreCase("Paint")){
            return new paintFac();
        }
        return null;
    }
}
public class Abstract_FactoryDesign_Eg {
    public static void main(String[] args) {
        AbstractFactory shapeFac = FactoryProducer.getFactory("Shape");
        shape s = shapeFac.getshape("square");
        s.draw();
        AbstractFactory paintFac = FactoryProducer.getFactory("paint");
        paint p = paintFac.getpaint("pen");
        p.input();
    }
}

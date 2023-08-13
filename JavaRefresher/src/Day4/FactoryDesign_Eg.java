package Day4;

interface Shape{
    void draw();
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("To draw Square");
    }
}


class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("To draw Rectangle");
    }
}

class Triangle implements Shape{

    @Override
    public void draw() {
        System.out.println("To draw Triangle");
    }
}

class ShapeFactory{
    public Shape createShape(String shapeType){
        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }
        else if(shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        else if(shapeType.equalsIgnoreCase("Triangle")){
            return new Triangle();
        }
        return null;
    }
}




public class FactoryDesign_Eg {
    public static void main(String[] args) {

      ShapeFactory shapeFactory = new ShapeFactory();
      Shape s = shapeFactory.createShape("Square");
      if(s!=null){
        s.draw();
      }
      s.draw();

        Shape r = shapeFactory.createShape("Rectangle");
        if(r!=null){
            r.draw();
        }

        Shape t = shapeFactory.createShape("Triangle");
        if(t!=null){
            t.draw();
        }






    }
}

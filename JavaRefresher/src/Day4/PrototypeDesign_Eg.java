package Day4;

interface Geometric extends Cloneable{
    void draw();
    Geometric clone();
}


class circle implements Geometric {

    @Override
    public void draw() {
        System.out.println("circle");
    }

    @Override
    public Geometric clone() {
        return new circle();
    }
}

class pentagon implements Geometric {

    @Override
    public void draw() {
        System.out.println("pentagon");
    }

    @Override
    public Geometric clone() {
        return new pentagon();
    }
}


public class PrototypeDesign_Eg {
    public static void main(String[] args) {
        Geometric circ = new circle();
        Geometric pen = new pentagon();

        Geometric clonedcir = circ.clone();
        Geometric clonedpen = pen.clone();

        clonedcir.draw();
        clonedpen.draw();

    }
}
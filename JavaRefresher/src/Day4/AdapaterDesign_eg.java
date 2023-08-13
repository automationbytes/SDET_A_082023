package Day4;


interface Printer{
    void print(String type,String name);
}

interface ImagePrinter{
    void imagePrint(String name);
}

interface TextPrinter{
    void textPrint(String name);
}

class myImagePrinter implements ImagePrinter{

    @Override
    public void imagePrint(String name) {
        System.out.println("Printing the file "+name);
    }
}

class myTextPrinter implements TextPrinter{

    @Override
    public void textPrint(String name) {
        System.out.println("Printing the file "+name);
    }
}

class myPrinter implements Printer{
    myImagePrinter image = new myImagePrinter();
    myTextPrinter text = new myTextPrinter();

    public myPrinter(){
        //implement anythg needed
    }

    @Override
    public void print(String type, String name) {
        if(type.equalsIgnoreCase("image")){
            image.imagePrint(name);
        }
        else if(type.equalsIgnoreCase("text")){
            text.textPrint(name);
        }

    }
}

public class AdapaterDesign_eg {
    public static void main(String[] args) {
        myPrinter m = new myPrinter();
        m.print("text","Selenium Description");
        m.print("image","Selenium logo");
    }

}


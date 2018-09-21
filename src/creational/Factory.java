package creational;

public class Factory {

}


interface Shape {
    void draw();
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}


class ShapeFactory {

   private ShapeFactory(String type){

    }

    static Shape getShape(String type){

        switch (type) {
            case "Rectangle":
                return new Rectangle();
            case "Square":
                return new Square();
            case "Circle":
                return new Circle();
        }
        return null;
    }


}


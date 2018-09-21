package creational;


class Handler{
    public static void main (String [] args){
        //Compiler Error
        //Singleton singleton = new Singleton();
        Singleton singleton = Singleton.getStaticInstance();
        Singleton singleton2 = Singleton.getStaticInstance();

        System.out.println("singleton: "+singleton.hashCode());
        System.out.println("singleton2: "+singleton2.hashCode());


        //Factory
        Shape rectangle = ShapeFactory.getShape("Rectangle");
        rectangle.draw();

        Shape circle = ShapeFactory.getShape("Circle");
        rectangle.draw();

        Shape square = ShapeFactory.getShape("Square");
        rectangle.draw();


    }
}

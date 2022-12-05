public class Main {
    public static void main(String[] args) {

        Shape shape  = new Shape();
        Shape shape1 = new Shape(7);
        Shape shape2 = new Shape(4, 9);
        Shape shape3 = new Shape(4, 2,2);
        Shape shape4 = new Shape(5, 3, 3, 9);

        String shapeV1 = shape.getShapeDetails();
        String shapeV2 = shape1.getShapeDetails();
        String shapeV3 = shape2.getShapeDetails();
        String shapeV4 = shape3.getShapeDetails();
        String shapeV5 = shape4.getShapeDetails();
        System.out.println(shapeV1);
        System.out.println(shapeV2);
        System.out.println(shapeV3);
        System.out.println(shapeV4);
        System.out.println(shapeV5);

    }
}
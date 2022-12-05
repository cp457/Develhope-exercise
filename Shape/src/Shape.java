public class Shape {

    public String shapeName;
    public int numberOfEdges;

    public  Shape() {

        System.out.println("A new shape as been created ");
        shapeName = " undefined shape";

    }
    public Shape(double radius) {

        System.out.println("A new circle as been created ");

        this.shapeName = " It's a circle ";
    }

    public Shape(int edges, double edgeLength) {

        System.out.println("A new square as been created ");

        this.numberOfEdges = edges;
        this.shapeName = "It's a square ";
    }

    public Shape(int edge, double a1, double a2) {

        System.out.println("A new rectangle as been created ");

        this.numberOfEdges = 4;
        this.shapeName = "It's a rectangle ";
    }

    public Shape(int edge, double a1, double a2, double a3) {

        System.out.println("A new triangle is here");
        this.numberOfEdges = 3;
        this.shapeName = "It's a triangle (?)";
    }

    public String getShapeDetails(){

        return  numberOfEdges + shapeName;
    }
}


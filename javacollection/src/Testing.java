

class Figure{

    double dimension1;
    double dimension2;

    Figure(double x,double y)
    {
        dimension1=x;
        dimension2=y;
    }


    double area()
    {
        double area=dimension1*dimension2;
        return area;
    }


}


public class Testing {

    public static void main(String[] args) {

        Figure figure=new Figure(10,20);
        System.out.println(figure.area());


    }
}

public class CalcApplication {
    public static void main(String[] args) {


        double p = Calculator.PI;
        System.out.println("The value of pi constant is equals to " + p);


        Calculator cal2 = new Calculator();
        System.out.println(cal2.counter);

        Calculator calculator = new Calculator();
        double area = calculator.circleArea(10);
        System.out.println("Area of the circle with radius 10 equal "+ area);
    }
}

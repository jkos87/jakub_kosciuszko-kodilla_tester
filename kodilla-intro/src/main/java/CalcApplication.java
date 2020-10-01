public class CalcApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double area = calculator.circleArea(10);
        System.out.println("Area of the circle with radius 10 equal "+ area);

        double p = calculator.PI;
        System.out.println("The value of pi constant is equals to " + p);
        System.out.println(calculator.counter);

        Calculator cal2 = new Calculator();
        System.out.println(cal2.counter);

        Calculator cal3 = new Calculator();
        System.out.println(cal3.counter);

        String name = UserDialogs.getUserName();
        System.out.println("HI " + name +". Thank you for visiting");
    }
}

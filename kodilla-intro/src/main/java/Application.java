public class Application {

    String name;
    double age;
    double height;

    public Application (String name, double age, double height) {
        this.name= name;
        this.age= age;
        this.height= height;
    }
    public void checkCond() {
        if (name != null) {
            if (this.age > 30.00) {
                if (this.height > 160.00) {
                    System.out.println("User is older than 30 and higher then 160cm");
                }
                    else {
                    System.out.println("User is exactly 30 or younger than 30 or he is exactly 160cm or shorter than 160cm");
                    }
            }
        }
    }
    public static void main(String[] args) {
        Application apple = new Application("Adam",40.5,178.00);

        apple.checkCond();
    }
}

public class Application {

    String name;
    double age;
    double height;

    public Application(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public boolean checkName() {
        return this.name != null;
    }

    public boolean checkAge() {
        return age > 30;
    }

    public boolean checkHeight() {
        return this.height > 160;
    }

    public static void main(String[] args) {

        Application application = new Application("Adam", 40.5, 178);
        if (application.checkName()) {
            if (application.checkAge() && application.checkHeight()) {
                System.out.println("User is older than 30 and higher then 160cm");
            } else {
                System.out.println("User is 30 – or younger than 30 – or shorter than 160cm");
            }
        }
    }
}



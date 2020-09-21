public class User {

    private String uName;
    private int uAge;

    public User(String uName, int uAge) {
        this.uName = uName;
        this.uAge = uAge;
    }

    public String getuName() {
        return uName;
    }

    public int getuAge() {
        return uAge;
    }

    public static void main(String[] args) {
        User Adam = new User("Adam", 24);
        User Max = new User("Max", 30);
        User Tom = new User("Tom", 44);
        User Alex = new User("Alex", 30);
        User Ted = new User("Ted", 20);
        User[] users = {Adam, Max, Tom, Alex, Ted};


        int averAge(int getuAge) {
            double result = 0;
            for (int i = 0; i < users.length; i++) {
                result = result + getuAge(i);
            }
            return result;
        }

    }

}

public class User {
    public static void main(String[] args) {

        User Adam = new User("Adam", 24);
        User Max = new User("Max", 30);
        User Tom = new User("Tom", 44);
        User Alex = new User("Alex", 30);
        User Ted = new User("Ted", 20);
        User[] users = new User[]{Adam, Max, Tom, Alex, Ted};

        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result = (result + users[i].uAge); //users[i].getAge()
        }
        int averAge = result / users.length;
        System.out.println(averAge);

        for (int i = 0; i < users.length; i++) {
            if (users[i].uAge < averAge) {
                System.out.println(users[i].uName);
            } else {
            }
        }
    }

    String uName;
    int uAge;


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

}






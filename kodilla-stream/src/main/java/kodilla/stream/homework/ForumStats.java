package kodilla.stream.homework;

import kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double userList = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >=40)
                .map(z ->z.getNumberOfPost())
                .mapToInt(n ->n)
                .average()
                .getAsDouble();
        System.out.println(userList);

        double userList2 = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() <40)
                .map(z ->z.getNumberOfPost())
                .mapToInt(n ->n)
                .average()
                .getAsDouble();
        System.out.println(userList2);
    }
}

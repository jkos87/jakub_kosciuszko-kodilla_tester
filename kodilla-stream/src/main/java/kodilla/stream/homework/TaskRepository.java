package kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Play with dog",LocalDate.of(2002,9,12),LocalDate.of(2002,12,2)));
        tasks.add(new Task("Return to home",LocalDate.of(2019,9,11), LocalDate.of(2021,3,13)));
        tasks.add(new Task("Get new Job",LocalDate.of(2020,9,1),LocalDate.of(2021,2,1)));
        tasks.add(new Task("Buy a new phone", LocalDate.of(2020,4,4),LocalDate.of(2020,7,7)));
        tasks.add(new Task("Go to holiday",LocalDate.of(2019,8,1),LocalDate.of(2019,8,18)));
        tasks.add(new Task("Go to Swimingpool",LocalDate.of(2018,7,31), LocalDate.of(2018,8,1)));
    return tasks;
    }

}

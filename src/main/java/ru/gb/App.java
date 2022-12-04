package ru.gb;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * Спроектировать и реализовать планировщик дел для работы с задачами разных приоритетов.
 * Например:
 * определить уровень приоритетов: низкий, средний, немедленное выполнение 
 * выделить компоненту для хранения данных 
 * выделить компоненту для организации импорта\экспорта данных
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        Comparator<Job> comparator = new TaskComparator().thenComparing(new DateCompatator());

        TreeSet<Job> tasks = new TreeSet<>(comparator);

        // Добавление задач
        // 1 - высокий приоритет, 2 - средний, 3 - низкий
        tasks.add(new Job(1, LocalDate.of(2022, 11, 25), 
            LocalDate.of(2022, 12, 2), 2));
        tasks.add(new Job(2, LocalDate.of(2022, 11, 21), 
            LocalDate.of(2022, 11, 30), 1));
        tasks.add(new Job(3, LocalDate.of(2022, 11, 22), 
            LocalDate.of(2022, 12, 3), 1));
        tasks.add(new Job(4, LocalDate.of(2022, 11, 18), 
            LocalDate.of(2022, 12, 3), 3));
        
        // Вывод задач
        for (Job job : tasks) System.out.println(job.getInfo());;

        // Запись в файл
        FileWriter writer = new FileWriter("tasks.txt", false);

        for (Job job : tasks) {
            writer.write(job.getInfo());
            writer.append("\n");
            writer.flush();
        }
    }
}

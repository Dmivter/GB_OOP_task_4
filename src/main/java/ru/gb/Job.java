package ru.gb;

import java.time.LocalDate;
// import java.util.Date;

public class Job {
    int id;
    LocalDate date;
    LocalDate deadline;
    public LocalDate getDate() {
        return deadline;
    }

    int priority;
    public int getPriority() {
        return priority;
    }

    String getInfo() {
        String str = String.format("id: %d, task date: %s, deadline: %s, priority: %d", id, date, deadline, priority);
        return str;
    }

    public Job(int id, LocalDate date, LocalDate deadline, int priority) {
        this.id = id;
        this.deadline = deadline;
        this.priority = priority;
        this.date = date;
    }

    


}

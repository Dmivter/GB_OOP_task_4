package ru.gb;

import java.util.Comparator;

public class TaskComparator implements Comparator<Job>{

    @Override
    public int compare(Job o1, Job o2) {
        if(o1.getPriority() > o2.getPriority()) return 1;
        else if(o1.getPriority() < o2.getPriority()) return -1; 
        else return 0;
    }
    
}

class DateCompatator implements Comparator<Job>{

    @Override
    public int compare(Job o1, Job o2) {
        return o1.getDate().compareTo(o2.getDate());
    }

}

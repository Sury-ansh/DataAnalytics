
import java.util.*;
import java.util.stream.*;
public class Task{
    Integer priority;
    String task;
    Task(int p, String m){
        this.priority=p;
        this.task=m;
    }
    @Override
    public String toString(){
        return "{"+priority+": "+task+"}";
    }
    public static void main(String[] args){
        Queue<Task> pq=new PriorityQueue<>(new Comp());
        pq.offer(new Task(1,"task1"));
        pq.offer(new Task(34,"task34"));
        pq.offer(new Task(0,"task0"));
        pq.offer(new Task(20,"task20"));
        pq.offer(new Task(10,"task10"));
        pq.offer(new Task(5,"task5"));
        //pq.forEach(System.out::print);
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}

public class Comp implements Comparator<Task>{
    @Override
    public int compare(Task a, Task b){
        return b.priority.compareTo(a.priority);
        //return Integer.compare(b.priority,a.priority);
    }
}


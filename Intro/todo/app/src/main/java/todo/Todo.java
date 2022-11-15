package todo;

import java.util.ArrayList;
public class Todo {
    ArrayList<String> tasks = new ArrayList<String>();
    public static void main(String[] args) {

    }

    public ArrayList<String> addTask(String task) {
        tasks.add(task);
        return tasks;

    }

    public ArrayList<String> getTasks() {
        return tasks;
    }
}

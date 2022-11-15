package todo;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TodoTest {
    @Test public void listShouldBeEmpty() {
        Todo todo = new Todo();
        assertTrue("show that task list is empty", todo.tasks.isEmpty());
    }

    @Test public void shouldAddTask() {
        Todo todo = new Todo();
        ArrayList<String> tasks = new ArrayList<String>();
        tasks.add("Cleaning");
        assertEquals("adds task Cleaning to array list", tasks, todo.addTask("Cleaning"));
    }

    @Test public void shouldGetTasks() {
        Todo todo = new Todo();
        ArrayList<String> tasks = new ArrayList<String>();
        tasks.add("Cleaning");
        tasks.add("Brushing");

        todo.addTask("Cleaning");
        todo.addTask("Brushing");

        assertEquals("should show all tasks stored", tasks, todo.getTasks());


    }
}

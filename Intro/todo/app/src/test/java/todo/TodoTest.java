package todo;

import org.junit.Test;
import static org.junit.Assert.*;

public class TodoTest {
    @Test public void isListOfTasksEmpty() {
        Todo todo = new Todo();
        assertTrue("show that task list is empty", todo.tasks.isEmpty());
    }
}

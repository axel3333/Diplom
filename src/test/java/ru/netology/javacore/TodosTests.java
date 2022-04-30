package ru.netology.javacore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TodosTests {
    Todos todos = new Todos();

    @Test
    public void testAddTask() {
        boolean expected = true;
        todos.addTask("Alex");
        boolean result = todos.list.contains("Alex");

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testRemoveTask() {
        boolean expected = false;
        todos.addTask("Alex");
        todos.removeTask("Alex");
        boolean result = todos.list.contains("Alex");

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testGetAllTasks() {
        String expected = "Alex Bobby Max ";
        todos.addTask("Max");
        todos.addTask("Alex");
        todos.addTask("Bobby");
        String result = todos.getAllTasks();

        Assertions.assertEquals(expected, result);
    }

    // ваши тесты для класса Todos
}

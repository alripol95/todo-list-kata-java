package edu.inlab.katas;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.junit.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by monica.follana on 29/11/2017.
 */
public class ToDoListTest {

    Task tasca = new Task("Tasca1");
    ToDoList tdl = new ToDoList();

    @Test
    public void creaTascaTest() {
        String nom = "Tasca1";

        assertEquals("Tasca1" , tasca.getNom());
        assertEquals(false , tasca.isDone());
    }

    @Test
    public void markAsDoneTest() {
        tasca.markAsDone();
        assertEquals(true , tasca.isDone());
    }

    @Test
    public void markAsUnDoneTest() {
        tasca.markAsUnDone();
        assertEquals(false , tasca.isDone());
    }

}

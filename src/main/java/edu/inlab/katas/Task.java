package edu.inlab.katas;

/**
 * Created by monica.follana on 29/11/2017.
 */
public class Task {
    private String nom;
    private boolean done;

    public Task(String nom) {
        this.nom=nom;
        done = false;
    }

    String getNom() {
        return this.nom;
    }

    Boolean isDone() {
        return done;
    }

    void markAsDone() {
        done = true;
    }

    void markAsUnDone() {
        done = false;
    }

}

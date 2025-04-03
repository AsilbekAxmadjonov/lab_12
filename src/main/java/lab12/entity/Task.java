package lab12.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

class Task {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    @ManyToOne
    private Employee assignedTo;

    public Task() {}
    public Task(String title, Employee assignedTo) {
        this.title = title;
        this.assignedTo = assignedTo;
    }
    // Getters and Setters
}
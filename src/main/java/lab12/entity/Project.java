package lab12.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Project {
    @Id
    @GeneratedValue
    private Long id;
    private String description;

    public Project() {}
    public Project(String description) {
        this.description = description;
    }
    // Getters and Setters
}
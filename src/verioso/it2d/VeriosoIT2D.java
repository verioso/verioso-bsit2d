
package verioso.it2d;


 
public class VeriosoIT2D {
    public class Task {
    private static int idCounter = 1; 
    private int id;
    private String title;
    private String description;
    private boolean completed;

    public Task(String title, String description) {
        this.id = idCounter++;
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markAsCompleted() {
        this.completed = true;
    }

    
    public String toString() {
        return String.format("ID: %d | Title: %s | Description: %s | Completed: %b",
                id, title, description, completed);
    }
}
}

     
    
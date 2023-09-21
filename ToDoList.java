import java.util.ArrayList;
import java.util.Scanner;



public class ToDoList {
	
	 private ArrayList<String> tasks;
	 
	 public ToDoList() {
	        tasks = new ArrayList<>();
	    }
	 
	 public void addTask(String task) {
	        tasks.add(task);
	    }
	 
	 public void removeTask(int index) {
	        if (index >= 0 && index < tasks.size()) {
	            tasks.remove(index);
	        } else {
	            System.out.println("Invalid index");
	        }
	    }
	 
	 public void displayTasks() {
	        if (tasks.isEmpty()) {
	            System.out.println("No tasks in the to-do list.");
	        } else {
	            System.out.println("To-Do List:");
	            for (int i = 0; i < tasks.size(); i++) {
	                System.out.println((i + 1) + ". " + tasks.get(i));
	            }
	        }
	    }

	public static void main(String[] args) {
		ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. Display tasks");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            
            switch (choice) {
            case 1:
                System.out.println("Enter the task:");
                String task = scanner.nextLine();
                toDoList.addTask(task);
                break;
            case 2:
                System.out.println("Enter the index of the task to remove:");
                int index = scanner.nextInt();
                toDoList.removeTask(index - 1);
                break;
            case 3:
                toDoList.displayTasks();
                break;
            case 4:
                System.out.println("Exiting the to-do list application.");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }
}

	}

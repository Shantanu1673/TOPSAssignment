package Exception;

public class Main {
    public static void main(String[] args) {
        try {
      
            Student student1 = new Student(1, "Shantanu", 20, "Computer Science");
            System.out.println(student1);

          
            Student student2 = new Student(2, "Jay", 22, "Mathematics");
            System.out.println(student2);
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            Student student3 = new Student(3, "Arun", 18, "Physics");
            System.out.println(student3);
            
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}



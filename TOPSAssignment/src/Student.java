package Exception;

import java.util.regex.Pattern;

public class Student
{
    private int rollNo;
    private String name;
    private int age;
    private String course;


    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException 
    {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
        
       
        if (age < 15 || age > 21) 
        {
            throw new AgeNotWithinRangeException("Age " + age + " is not within the range of 15 to 21.");
        }
        
       
        if (!isValidName(name)) 
        {
            throw new NameNotValidException("Name \"" + name + "\" contains invalid characters.");
        }
    }

    private boolean isValidName(String name
    		) {
      
        String regex = "^[a-zA-Z ]+$";
        return Pattern.matches(regex, name);
    }

    
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }
}


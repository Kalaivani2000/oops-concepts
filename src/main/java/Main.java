public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        // Set values using setter methods
        student.setId(1);
        student.setName("kalai");
        student.setDateOfBirth("29-07-2000");
        student.setDepartment("ECE");

        // Get values using getter methods
        int id = student.getId();
        String name = student.getName();
        String dateOfBirth = student.getDateOfBirth();
        String department = student.getDepartment();

        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Department: " + department);
    }
}


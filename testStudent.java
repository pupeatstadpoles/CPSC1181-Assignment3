public class testStudent {
    public static void main(String[] args) {
        String namez = "Window Washer";
        String address = "1 at 1 Street";
        Student window = new Student (namez, address);
        window.addCourse(3.23,4);
        window.addCourse(2.3, 3);
        window.addCourse(4.3, 3);
        System.out.println("GPA should be: " + window.calculateGPA());
        System.out.println("Student's name is: " + window.getName());
        System.out.println("Student's address is: " + window.getAddress());
        System.out.println("Student's student number is: " + window.getStudentNum());
        System.out.println("Student's login id is: " + window.getLoginId());


        Student randyRam = new Student("Randy Ram", "5 Mango Ave.");
        System.out.println("\n\nGPA before adding courses should be: " + randyRam.calculateGPA());
        randyRam.addCourse(4, 3);
        randyRam.addCourse(3.7, 3);
        randyRam.addCourse(4.3, 3);
        System.out.println("Now the GPA should be: " + randyRam.calculateGPA());
        System.out.println("Student's name is: " + randyRam.getName());
        System.out.println("Their student number is: " + randyRam.getStudentNum());
        System.out.println("Student's login id is: " + randyRam.getLoginId());

        Student oh = new Student("Oh No", "Langara College");
        System.out.println("\n\nStudent's login id is: " + oh.getLoginId());
        System.out.println("Their student number is: " + oh.getStudentNum());


    }
}
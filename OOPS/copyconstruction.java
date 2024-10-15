//  How to make a copy constructors
public class copyconstruction {
    public static void main(String[] args) {
        // object calling
        Student s1 = new Student();
        s1.name = "raju";
        s1.roll = 587;
        s1.password = "rrrrr";
        s1.marks[0] = 478;
        s1.marks[1] = 100;
        s1.marks[2] = 2257;
        // new constructors
        Student s2 = new Student(s1);
        s2.password = "xyes";
        for(int i = 0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
       
    }
    
}
// creat a class 

class Student{
    String name ;
    int roll;
    String password ;
    int marks[];
    
    // create a copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        marks = new int[3];
    }

    // Peramatrized constructors
    Student(String name){
    this.name = name;
    marks = new int[3];

    }
    // Non peramatrize constructors
    Student(){
        System.out.println("Constructor is called...........");
        marks = new int[3];

    }


}
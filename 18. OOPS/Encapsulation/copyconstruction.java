
//  How to make a copy constructors
public class copyconstruction {
    public static void main(String[] args) {
        // object calling s1 all property
        Student s1 = new Student();
        s1.name = "raju";
        s1.roll = 587;
        s1.password = "rrrrr";
        s1.marks[0] = 478;
        s1.marks[1] = 100;
        s1.marks[2] = 2257;
        // new constructors
        Student s2 = new Student(s1);
        System.out.println(s2);
        s2.password = "xyes";
        // this porblem is reference
        s1.marks[0] = 8888;
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

    //Shallow copy constructor
    /*Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this. marks = s1.marks;
    }
        */
    // deep copy construction
       Student(Student s1){
        marks = new int [3];
        this.name = s1.name;
        this.roll  = s1.roll;
        for(int i = 0;i<3;i++){
            this.marks[i] = s1.marks[i];
        }
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

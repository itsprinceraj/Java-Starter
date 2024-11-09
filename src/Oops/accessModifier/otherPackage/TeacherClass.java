package Oops.accessModifier.otherPackage;

public class TeacherClass {

// by default all the methods and variable from this class is set to default or package-private;
//     It means these are only accessible throughout the package;



//     when you make private to anything then it can only be accessible inside the same class only, not outside the class;
    private int id;
    String name = "Harish";


//     when you make public to anything then it is accessible throughout the class, package and also outside the package;
    public void teaching(){
        System.out.println("Teacher is teaching");
    }


    protected void teach(){
        System.out.println("Protected Teach");
    }

    public static void main(String[] args) {
        TeacherClass tc =new TeacherClass();
        tc.id = 521;
        tc.teach();
    }

}

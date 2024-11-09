package Oops.accessModifier.otherPackage;

public class Teacher2Class extends TeacherClass {
    public static void main(String[] args) {
        TeacherClass tc = new TeacherClass();
        tc.name = "vishal";
//        System.out.println(tc.name);
        tc.teach();
    }

}

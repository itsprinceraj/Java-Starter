package Oops.accessModifier.otherPackage2;

import Oops.accessModifier.otherPackage.TeacherClass;

 class StudentClass extends TeacherClass {
    public static void main(String[] args) {
        TeacherClass tc = new TeacherClass();
//        tc.teaching();

        StudentClass sc = new StudentClass();
        sc.teach();


    }


}

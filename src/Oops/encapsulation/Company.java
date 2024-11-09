package Oops.encapsulation;

public class Company {

// Encapsulation:  It is method by which we can achieve data hiding , but it's not the actual data hiding. by using encapsulation we can bundle or bind some properties and method to the same class in which they are used;

    private String valuation = "5cr";
     int employees = 500;
    String name = "HDS";

// If anyone want to change or access those values , then must go through some validation checks;

    boolean canChange = true;

    public String changeVal(String val){
        if(canChange) {
            this.valuation = val;
            return valuation;
        }
        return "-1";
    }

    public void changeNumEmp(int num){
        if(canChange)
            this.employees = num;
    }

    static int id  = 10;
    static{
        System.out.println("this is 1");
    }

    public static void main(String[] args) {

    }
}



// create a parent class;
class Employ extends Company{
    static{
        System.out.println("this is 2");
    }
    public static void main(String[] args) {
        Company cp = new Company();
        Company cp1 = new Company();
//        System.out.println(cp.name);
//        System.out.println(cp.changeVal("10Cr"));  // it can't be done until validation check is passed;


        cp.employees = 200;
        System.out.println(cp.employees); //200
        System.out.println(cp1.employees);//500
        System.out.println(Employ.id);
        cp.id = 15;
        System.out.println(cp.id); //15
        System.out.println(Employ.id);  // 15

    }


//
    static {
    System.out.println("This is 3");
}
}



// static block and static keyword;

// Static: Static keywords are bind with Class not with objects. In static object is not created for static , so that you can't use this ans super keyword inside static method or block;
// Static variable, methods and classes loads first , it loads before the main function also ;
// if any variable ,method and class is declared with static, then it is not recommended to change or modify it;
// variable / methods declared with static Keyword can be accessible with class name only , you don't need to take instance for using static members;
// You can't use no-static methods inside static methods. but you can use static methods under non-static methods or class;
// if static variable is modified once ,then it will be modified at every place;











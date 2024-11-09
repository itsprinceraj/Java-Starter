public class StringsInJava {
    public static void main(String[] args) {

        // Strings in java are created in two ways;
        String str = "prince"; // 1st way;
        String str1 = new String("Prince"); // 2nd way;   it will create a string object ;

// Strings are immutable in java;
// when we create two different string with same value, Then the two different variable points to the same value in the heap memory;
// Strings in java is referenced Data type;
//         so it is always compared by its reference not by values;
//         if you want to compare strings with values then you can use Java Strings in build mehthods;

//        if(str == str1)  // this will check reference;
//            System.out.println(true);
//        else
//            System.out.println(false);
            if(str.equals(str1))  // it checks value
                System.out.println(true);
            else
                System.out.println(false);

        if(str.equalsIgnoreCase(str1) )  // it checks value
            System.out.println(true);
        else
            System.out.println(false);

    }
}

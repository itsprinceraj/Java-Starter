public class StringBuff {
    public static void main(String... args){

//         String Buffer;
//        String Buffers are different from Java Strings;
//        While Strings are immutable in Java , whereas String Buffer is mutable in Java;

        StringBuffer str = new StringBuffer();
        str.append("Prince");
        str.insert(6, " Raj");
        str.delete(6,7);  // ending index is excluded;
//        str.reverse();
        str.replace(0,6 , "Aaliya ");
        System.out.print(str);

    }
}

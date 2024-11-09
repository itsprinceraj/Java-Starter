public class Typecast{
    public static void main(String[] args){
        long num = 200_000_000_0;
        int x = (int)num;
        System.out.println(x);

        short y = (short)num;  // this type of conversion is called lossy conversion . java does not give any error but whenever we're typecasting from longer datatype to smaller , we must aware about the range of datatype in which we are storing the value
        System.out.println(y);

        // writing constants in java

        final int number = 2541; // to make a variable constant in java , we use final keyword
        System.out.println(number);

        System.out.println("Hello \n");
        System.out.println("World!");



    }

}
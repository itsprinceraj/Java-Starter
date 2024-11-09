public class DataTypes {
    public static void main(String[] args){

        // int datatype ;
        byte  byteInt1 = 127; //  it stores only 1 byte ;
        int  byteInt = (byte) 130;    // we cannot store more than 127 in byte dataType, so we explicitly converted it ;
        System.out.println(byteInt);

        short shortInt = 10000;  // it stores 2 byte ;
        System.out.println(shortInt);

        int onlyInt = 500000;  // it stores 4 byte;
        System.out.println(onlyInt);

        long longINt = 100_000_000_000_000_000_0L;  // it stores 8 byte ; and underscores is going to ingnored by compiler;
        System.out.println(longINt);

        // float datatype

        float floatType = 10.254F;  // if we won't put 'F' here then by default interpreter will treat it as double type , so we must put 'F' after the float value;
        System.out.println(floatType);

        double doubleType = 5247.58732;
        System.out.println(doubleType);

        // boolean datatype ;

        boolean boolType = true;
        System.out.println(boolType);

        boolean boolType2 = false;
        System.out.println(boolType2);

        // String datatype

        String string1 = "I Love MERN";
        System.out.println(string1);

        String string2 = """
                My name is prince raj 
                I am a mern stack developer
                and i wanted to be a software Engineer 
               
                """;
        System.out.println(string2);




    }
}
public class MultiDimArray {
    public static void main(String... args){

        // multidimensional Array;
        int marks[][] = {
                {15,55,69},   // 0th row;
                {89,23,46},   // 1st row;
                {91,34,73},   // 2nd row
                {42,67,82},   // 3rd row;
        };

//         in multiDimensional array, outer index shows the row and inner indes shows the col of current row;

        // now access 2nd row and 3rd col;
        System.out.println(marks[1][2]);  // arrays are in 0 based indexing;
    }
}

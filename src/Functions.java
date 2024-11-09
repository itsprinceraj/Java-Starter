import java.util.Arrays;

public class Functions {
    public static void main(String[] args){

//  main is the first function which get executed when program is run;
//        for invoking any function inside main, the function must be inside the public class , and that is must be static , cause main is a static funcion,


//         Static: Static means, for this function we do not have to create any object. its just a normal or static function , Other function will be studied in oops


//         call a static fuction ;
          int ans = sum(40,5);  // store the returned value of sum;
//        System.out.println(ans);

        int arr[] = {5,8,3,7,15,2,1};
//         call arrayfunc;
        int size =arr.length;
        sortArray(arr,size);
        for(int nums:arr){
            System.out.print(nums + " ");
        }

    }

//     create static function sum;
    static int sum (int a, int b){
        return a+b;
        //System.out.println(a+b);  // this is an unreachable statement , cause when return invoked, the program comes out from the function ;
    }


//     create a function which accepts array and sort the array;
    static void sortArray(int arr[], int size){
        Arrays.sort(arr);
    }
}

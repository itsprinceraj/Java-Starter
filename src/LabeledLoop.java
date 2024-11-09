public class LabeledLoop{
    public static  void main(String... args){


//     when we use break or continue statement it just break or skips the current iteration , if we want that it gets out of a particular nesting level of loop , then we use labeling of the loops;

        outerLoop:for(int i= 0; i< 5; i++)
        {
            for(int j =0; j<i; j++){
                System.out.print("* ");
                if(i == 4){
                    break outerLoop;   // it will come out from the inner loop and mark to the labeled loop;
                }
            }

            System.out.println();
        }
    }
}





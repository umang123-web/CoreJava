package Chapter13.MethodinJava;

public class Varargs {

    static int max(int ...x){
        //take the first number in the array as biggest
        int max=x[0];
        //compare the biggest numbers with other numbers
        for(int i=1; i<x.length; i++){
            /*
            If the biggest is less than the other number then take that other number as a biggest
             */


            if(max <x[i]){
                max=x[i];
            }
        }

        return max;
    }


    public static void main(String[] args) {
        int arr1[]={10 , 20 , 30 , 40};
        int arr2[] ={1 , 4 , 8 , 5};

        int result = max(arr1);
        //pass an array of 3 elements to varargs method
        System.out.println("the max value of arr1 is:" + result);


        result = max(arr2);
        System.out.println("the max value of arr2:" + result); 
    }
}

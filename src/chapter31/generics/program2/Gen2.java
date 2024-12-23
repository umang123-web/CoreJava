package chapter31.generics.program2;
/*
* A generic method that receives an array and display the element of the array. The array element may be of any data
* type
*
* */

class MyClass{

    static<T> void display(T[]arr ){
        for(T t:arr){
            System.out.println(t);
        }
    }

}
public class Gen2 {

    public static void main(String[] args) {
        Integer[] arr1 ={1 , 2, 3, 4};
        String[] arr2 ={"Umang" , "Hitesh" , "Michael"};
        Double[] arr3 = {12.1 , 22.22 ,  123.45 , 456.78};


        MyClass.display(arr2);

    }
}

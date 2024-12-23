package Chapter13.MethodinJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/*
This is the program to add matrix and display sum method
 */



public class Matrix {


    int arr[][];

    int r, c;


    public Matrix(int r, int c) {
        this.r = r;
        this.c = c;
        arr = new int[r][c];
    }


    int[][] getMatrix() throws Exception {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //StringTokenizer is useful to accept each row as a single string and
        //then divide it into tokens. Each token represents an array element


        StringTokenizer st;

        for (int i = 0; i < r; i++) {
            String s = br.readLine();
            st = new StringTokenizer(s, " ");
            for (int j = 0; j < c; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }


        }

        return  arr;

    }

    //accept two 2dArrays and find sum matrix and return it

    int [][] findSum(int a [] [] , int b [] []){
        int temp [] [] = new int [r] [c];

        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++){

                temp[i][j]= a[i][j]+b[i][j];
            }


        return temp;

    }



    //display the resultant 2d array as an Matrix
    void displayMatrix(int res[] []){
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.println(res[i][j] + "\t");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {


        Matrix obj1 = new Matrix(3 ,3);

        Matrix obj2 = new Matrix(3 ,3 );


        //take 3 references for 2d Arrays

        int x[][] , y[][] , z[][];
        System.out.println("\n Enter elements for first matrix: ");
        x= obj1.getMatrix();
        System.out.println("\n Enter elements for second matrix:");
        y=obj2.getMatrix();

        //add the matrix and return sum matrix into z;

        z = obj1.findSum(x , y);

        System.out.println("\n The sum matrix is: ");

        obj2.displayMatrix(z);

    }
}

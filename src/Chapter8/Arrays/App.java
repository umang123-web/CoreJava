package Chapter8.Arrays;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {


        //this is the example of 1d array

        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many Subjects?");

        int n = Integer.parseInt(br.readLine());

        int[] marks = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter mark: ");
            marks[i] = Integer.parseInt(br.readLine());
        }


        int tot=0;
        for(int i=0; i<n; i++){
            tot += marks[i];

            System.out.println("Total marks =" + tot);

            float percentage = (float) tot/n;
            System.out.println("Percentage=" + percentage);
        }


         */


        /*

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("How many elements?: ");

        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];

         //accept integer element into the array
        for(int i=0; i<n; i++){
System.out.print("Enter int:");
arr[i] = Integer.parseInt(br.readLine());
        }

        //using the bubble technique to sort the number to ascending order

        int limit = n-1;
        boolean flag = false;
        int temp;


        for(int i=0; i<limit; i++){

            for(int j=0; j<limit-i; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    flag = true; //swaaping down
                }
            }

            if(flag == false){
                break;
            }else{
                flag = false;
            }

            System.out.println("The sorted array is:");

            for(int k=0; k<n; k++){
                System.out.println(arr[k]);
            }
        }


         */


        //example of 2d array

/*
        float x [] [] = {{1.f , 1.2f , 1.3f , 1.4f} , {2.1f , 2.2f , 2.3f , 2.4f} , {3,1f , 3.2f , 3.3f , 3.4f}};

        //read and display the array elements


        System.out.println("In matrix form");


        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.println(x[i][j] + "\t");
            }

            //next line
            System.out.println();
        }


 */


/*
        //In this code we are doing the transpose means that converting rows into column and column into row

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows , column? ");

        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr [] [] = new int[r][c];

        System.out.println("Enter element of matrix:  ");


        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
                arr[i][j] = sc.nextInt();
        System.out.println("The transpose matrix:");


        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                System.out.println(arr[j][i] + " ");
            }
            System.out.println("\n");
        }
*/


        //3d arrays
/*
        int dept, student, marks, tot = 0;

        int arr[][][] = {{{50, 51, 52}, {60, 61, 62}}, {{70, 1, 72}, {80, 81, 82}}, {{65, 66, 67}, {75, 76, 77}}};

        //display  the mark from 3d array


        for(dept =0; dept<3; dept++)
            System.out.print("Department:" + (dept +1) + " :");

        for(student =0; student<2; student++){
            System.out.print("Student:" + (student+1) + " : marks");

            for(marks=0; marks <3; marks++){
                System.out.print(arr[dept][student][marks] + " ");
                tot +=arr[dept][student][marks];

            }
            System.out.println("total:" + tot);
             tot =0;

            System.out.println();

        }


 */


        //command line arguments    
/*

        int n = args.length;

        System.out.println("No of args =" + n);
        //display all the arguments
        System.out.println("The args are:");

        for(int i=0; i<n; i++){
            System.out.println(args[i]);
        }

 */


        //args contains name display them


    }


    class Class1 {

        public static void main(String[] args) {


            for (String name : args) {
                System.out.println(name);
            }
        }

        class Class2 {
            public static void main(String[] args) throws IOException {



                String names[] = {"Gopi", "Kamal", "Vinay", "Neeta"};


                    Class1.main(names);

            }
        }

    }
}

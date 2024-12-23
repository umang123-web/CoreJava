package Chapter15.Inheritence;


/*

Program 6: A program to understand than the parameterized constructor of the super class can be called from sub
class using super method
 */



class five{
    int i;

    five(int i){
        this.i =i;
    }


    void show(){
        System.out.println("the value of i:"  + i);
    }
}


class six extends five{

    int i;
    six(int a , int b) {

        //call super class method and pass a variable

        //super is nothing but this is a super clas s
        super(a);
        i=b;
    }


    void show(){

        System.out.println("The value of super class:"  + super.i);
        System.out.println("The value of i:"  +  i);

    }
}


public class Super2 {

    public static void main(String[] args) {
        six six = new six(11 , 22);

        six.show();
    }

}

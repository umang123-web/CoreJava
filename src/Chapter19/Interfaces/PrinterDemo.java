package Chapter19.Interfaces;
/*
Program 2: A program which contains a Printer Interface and its implementation classes to send
text to any editor
 */

import java.io.*;

import static java.lang.Class.forName;

interface Printer{
    //toprint the text send to printer

    void printit(String text);


    void disconect();
}



class EpsonPrinter implements Printer{

    @Override
    public void printit(String text) {
        System.out.println(text);
    }

    @Override
    public void disconect() {

        System.out.println("printing completed");
        System.out.println("disconnecting the printer");
    }
}

class IBMprinter implements Printer{

    @Override
    public void printit(String text) {
        System.out.println(text);
    }

    @Override
    public void disconect() {

        System.out.println("printing completed");
        System.out.println("Disconnecting the printer");
    }
}

public class PrinterDemo {

@SuppressWarnings("unchecked")
    public static void main(String [] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        FileReader file = new FileReader("config.txt");
        LineNumberReader line = new LineNumberReader(file);
        String print = line.readLine();
        System.out.println("Loading the driver name :"  + print);
        Class<?> c = Class.forName(print);

        Printer ref =(Printer) c.newInstance();
        ref.printit("Hello this is printed on the printer");
        ref.disconect();
    }

}


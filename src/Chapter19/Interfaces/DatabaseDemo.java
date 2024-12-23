package Chapter19.Interfaces;


/*
Program 1: A program to create an interface MyInter that connect to a database and retrieve the data
 from the database

 */
interface Database{
    void connect();
    void disconnect();
}


class Oracledb implements Database{

    @Override
    public void connect() {
        System.out.println("connecting to oracle database....");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnecting to oracle database...");
    }
}

class Sysdb implements Database{

    @Override
    public void connect() {
        System.out.println("connecting to sysdb ...");

    }



    @Override
    public void disconnect() {
        System.out.println("disconnecting to sysdb...");

    }
}
public class DatabaseDemo {

    public static void main(String args[ ]) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Class<?> c = Class.forName(args[0]);

        Database database = (Database) c.newInstance();

        database.connect();
        database.disconnect();
    }
}

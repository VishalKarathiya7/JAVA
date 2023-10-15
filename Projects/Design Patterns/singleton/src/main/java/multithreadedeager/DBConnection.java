package multithreadedeager;
//This is eager loading of object.
//We are creating object when we are loading the class.
//The problem here is if the object creation in expensive, it will take extra time in starting the application
// the other problem is, if we want to create this object based on some condition we will not have that control
public class DBConnection {
    private static DBConnection dbConnection = new DBConnection();

    private DBConnection(){}

    public static DBConnection createInstance(){
        return dbConnection;
    }
}

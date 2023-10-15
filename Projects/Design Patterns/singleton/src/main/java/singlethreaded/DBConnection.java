package singlethreaded;
//This solution will not work in multithreaded environment
public class DBConnection {
    private static DBConnection dbConnection;

    private DBConnection(){}

    public static DBConnection createInstance(){
        if(dbConnection == null){
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }
}

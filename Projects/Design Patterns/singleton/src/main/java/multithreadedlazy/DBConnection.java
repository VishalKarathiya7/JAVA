package multithreadedlazy;
//This is a perfect solution for multithreaded environment as well
public class DBConnection {
    private static DBConnection dbConnection;

    private DBConnection(){}

    public static DBConnection createInstance(){
        if(dbConnection == null){
            synchronized (DBConnection.class) {
                if (dbConnection == null) {
                    dbConnection = new DBConnection();
                }
            }
        }
        return dbConnection;
    }
}

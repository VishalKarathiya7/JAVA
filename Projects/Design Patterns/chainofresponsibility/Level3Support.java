package chainofresponsibility;

public class Level3Support implements SupportTeam{
    private static final int THRESHOLD = 3;


    @Override
    public void handleRequest(int level) {
        if(level <= THRESHOLD){
            System.out.println("Level 3 support team is handling the request");
        }else {
            System.out.println("No suitable next team found");
        }
    }
}

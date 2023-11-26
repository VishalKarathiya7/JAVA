package chainofresponsibility;

public class Level2Support implements SupportTeam{
    private static final int THRESHOLD = 2;
    private SupportTeam nextTeam;

    @Override
    public void handleRequest(int level) {
        if(level <= THRESHOLD){
            System.out.println("Level 2 support team is handling the request");
        }else if(nextTeam != null) {
            nextTeam.handleRequest(level);
        }
    }
    public void setNextTeam(SupportTeam nextTeam){
        this.nextTeam = nextTeam;
    }
}

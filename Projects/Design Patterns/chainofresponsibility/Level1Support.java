package chainofresponsibility;

public class Level1Support implements SupportTeam{
    private static final int THRESHOLD = 1;
    private SupportTeam nextTeam;

    public void setNextTeam(SupportTeam nextTeam){
        this.nextTeam = nextTeam;
    }

    @Override
    public void handleRequest(int level) {
        if(level <= THRESHOLD){
            System.out.println("Level 1 support team is handling the request");
        }else if(nextTeam != null) {
            nextTeam.handleRequest(level);
        }
    }

}

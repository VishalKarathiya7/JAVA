package chainofresponsibility;

public class Client {
    public static void main(String[] args) {
        SupportTeam level1 = new Level1Support();
        SupportTeam level2 = new Level2Support();
        SupportTeam level3 = new Level3Support();

        ((Level1Support) level1).setNextTeam(level2);
        ((Level2Support) level2).setNextTeam(level3);

        level1.handleRequest(2);
        level1.handleRequest(4);

    }
}

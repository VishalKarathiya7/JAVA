package command;

public class Client {
    public static void main(String[] args) {
        Light drawingRoomLight = new Light();

        Command drawingRoomLightOn = new LightOnCommand(drawingRoomLight);

        RemoteControl myRemote = new RemoteControl();

        myRemote.setCommand(drawingRoomLightOn);
        myRemote.pressButton();
    }


}

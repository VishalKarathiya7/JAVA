package facade;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem){
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }

    public void watchMovie(){
        System.out.println("Get ready to watch Movie ");
        dvdPlayer.on();
        soundSystem.on();
        projector.on();
    }

    public void endMovie(){
        System.out.println("Shutting Down the system ");
        dvdPlayer.off();
        soundSystem.off();
        projector.off();
    }

}

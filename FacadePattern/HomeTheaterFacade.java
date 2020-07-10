package FacadePattern;

import Component.*;

public class HomeTheaterFacade {
    private Amplifier amplifier;
    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;
    private Projector projector;
    private TheatreLights theatreLights;
    private Screen screen;
    private PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, DvdPlayer dvdPlayer, CdPlayer cdPlayer, Projector projector, TheatreLights theatreLights, Screen screen, PopcornPopper popper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.theatreLights = theatreLights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        
        System.out.println("Mempersiapkan film...");
        System.out.println("CD Siap"); cdPlayer.on();
        System.out.println("Amplifier siap"); amplifier.on();
        System.out.println("Lampu teater siap"); theatreLights.on();
        System.out.println("Popcorn siap"); popper.pop();
        System.out.println("layar siap"); screen.on();
        System.out.println("Tuner Siap");tuner.on();
        System.out.println("DVD player siap"); dvdPlayer.on();
        System.out.println("Film siap diputar!");
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        popper.off();
        theatreLights.off();
        screen.off();
        dvdPlayer.off();
        cdPlayer.off();
        tuner.off();
        amplifier.off();
        dvdPlayer.off();
    }
}
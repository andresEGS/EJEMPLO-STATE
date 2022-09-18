package src;

import java.util.Timer;
import java.util.TimerTask;

public class Durmiendo implements State {
    private Perrito perrito;

    @Override
    public void jugar() {
    }

    @Override
    public void alimentar() {
    }

    @Override
    public void dormir() {
    }

    @Override
    public void comoEstas() {
        System.out.println("(está durmiendo shh)");
    }

    @Override
    public void setPerrito(Perrito perrito) {
        this.perrito = perrito;

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Durmiendo.this.perrito.setState(new Hambriento());
            }
        }, 7000);
    }
}

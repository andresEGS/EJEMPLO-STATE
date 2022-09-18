package src;

public class Cansado implements State {
    private Perrito perrito;

    @Override
    public void jugar() {
        System.out.println("No quiero jugar!");
    }

    @Override
    public void alimentar() {
        System.out.println("No quiero comer!");
    }

    @Override
    public void dormir() {
        System.out.println("Buenas noches uwu");
        perrito.setState(new Durmiendo());
    }

    @Override
    public void comoEstas() {
        System.out.println("Tengo sueño...");
    }

    @Override
    public void setPerrito(Perrito perrito) {
        this.perrito = perrito;
    }
}

package src;

public class Hambriento implements State {
    private Perrito perrito;

    @Override
    public void jugar() {
        System.out.println("No quiero jugar!");
    }

    @Override
    public void alimentar() {
        System.out.println("Ñom ñom ñom");
        perrito.setState(new Aburrido());
    }

    @Override
    public void dormir() {
        System.out.println("No quiero dormir!");
    }

    @Override
    public void comoEstas() {
        System.out.println("Dame de comer!");
    }

    @Override
    public void setPerrito(Perrito perrito) {
        this.perrito = perrito;
    }
}

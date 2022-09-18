package src;

public class Aburrido implements State {
    private Perrito perrito;

    @Override
    public void jugar() {
        System.out.println("Yaa! Jugemos!");
        perrito.setState(new Cansado());
    }

    @Override
    public void alimentar() {
        System.out.println("No quiero comer!");
    }

    @Override
    public void dormir() {
        System.out.println("No quiero dormir!");
    }

    @Override
    public void comoEstas() {
        System.out.println("Estoy aburrido!! Quiero jugar!");
    }

    @Override
    public void setPerrito(Perrito perrito) {
        this.perrito = perrito;
    }
}

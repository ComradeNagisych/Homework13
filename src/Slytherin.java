public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambitions;
    private int inventiveness;
    private int powerHungry;
    public Slytherin(String name, String surname, int cunning, int determination, int ambitions, int inventiveness, int powerHungry, int magicPower, int transgression){
        super(name, surname, magicPower, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambitions = ambitions;
        this.inventiveness = inventiveness;
        this.powerHungry = powerHungry;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbitions() {
        return ambitions;
    }

    public void setAmbitions(int ambitions) {
        this.ambitions = ambitions;
    }

    public int getInventiveness() {
        return inventiveness;
    }

    public void setInventiveness(int inventiveness) {
        this.inventiveness = inventiveness;
    }

    public int getPowerHungry() {
        return powerHungry;
    }

    public void setPowerHungry(int powerHungry) {
        this.powerHungry = powerHungry;
    }

    @Override
    public String toString() {
        return "Slytherin " + super.toString() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambitions=" + ambitions +
                ", inventiveness=" + inventiveness +
                ", powerHungry=" + powerHungry;
    }
}

public class Bus {
    private final int seats;
    private int number;
    private int peopleAmount;
    private String owner;

    //constructors
    public Bus(int seats, int number, String owner) {
        this.seats = seats;
        this.number = number;
        this.owner = owner;
    }
    public Bus() {
        this.seats = 40;
    }

    //getters
    public int getSeats() {
        return seats;
    }
    public int getNumber() {
        return number;
    }
    public int getPeopleAmount() {
        return peopleAmount;
    }
    public String getOwner() {
        return owner;
    }

    //setters
    public void setNumber(int number) {
        if (number <= 0) throw new IllegalArgumentException("Argument can not be negative or equal to zero");
        this.number = number;
    }
    public void setOwner(String owner) {
        if (owner.equals("")) throw new IllegalArgumentException("Argument can not be empty string");
        this.owner = owner;
    }

    //methods
    public String getBusInfo() {
        return String.format("Autobus číslo %d společnosti %s s počtem sedadel %d veze %d cestujicich", number, owner, seats, peopleAmount);
    }
    public void dropOff(int peopleAmount) {
        if (peopleAmount < 0) throw new IllegalArgumentException("Argument can not be negative");
        this.peopleAmount = peopleAmount <= this.peopleAmount ? this.peopleAmount - peopleAmount : 0;
    }
    public void dropOffAllPeople() {
        this.peopleAmount = 0;
    }
    public void pickUp(int peopleAmount) {
        if (peopleAmount < 0) throw new IllegalArgumentException("Argument can not be negative");
        this.peopleAmount = peopleAmount > (this.seats - this.peopleAmount) ? this.seats : this.peopleAmount + peopleAmount;
    }
}
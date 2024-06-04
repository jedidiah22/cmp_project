package OOP;

public class computer implements Electronic{
    RAM ram;

    processor cpu;

    storage storage;


    public computer(RAM ram, processor cpu, OOP.storage storage) {
        this.ram = ram;
        this.cpu = cpu;
        this.storage = storage;
    }

    @Override
    public boolean on() {
        return true;
    }

    @Override
    public boolean off() {
        return false;
    }

    @Override
    public String toString() {
        return "computer{" +
                "ram=" + ram +
                ", cpu=" + cpu +
                ", storage=" + storage +
                '}';
    }
}

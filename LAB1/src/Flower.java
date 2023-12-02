public class Flower {

    String name;
    int pettle;
    float priece;

    public Flower(String name, int pettle, float priece) {
        this.name = name;
        this.pettle = pettle;
        this.priece = priece;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPettle() {
        return this.pettle;
    }

    public void setPettle(int pettle) {
        this.pettle = pettle;
    }

    public float getPriece() {
        return this.priece;
    }

    public void setPriece(float priece) {
        this.priece = priece;
    }

    public String toString() {
        return "Flower{name='" + this.name + "', pettle=" + this.pettle + ", priece=" + this.priece + "}";
    }


    public static void main(String[] args) {
        Flower F = new Flower("rose", 22, 23.5F);
        System.out.println(F.toString());
    }
}

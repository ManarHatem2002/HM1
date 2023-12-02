public class Students {

    String name ;
    int age ;
    int id ;

    public Students(String name, int age , int id) {
        this.name = name;
        this.age = age;
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {

        Students[] studens = new Students[]{
         new Students(" a ", 18, 12),
         new Students(" b ", 15, 11),
         new Students(" c ", 16, 13)};

        Students[] var2 = studens;
        int var3 = studens.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Students i = var2[var4];
            System.out.println(i);}
    }
}

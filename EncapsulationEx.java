class PersonDetails {

    private String name;
    private int age;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }
}

public class EncapsulationEx {
    public static void main(String[] args)
    {
        PersonDetails p = new PersonDetails();
        p.setName("Viji");
        p.setAge(23);
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}
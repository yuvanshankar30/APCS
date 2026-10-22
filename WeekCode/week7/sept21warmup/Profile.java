public class Profile
{
    private String name;
    private int age;

    public Profile()
    {
        name = "John";
        age = 15;
    }

    public Profile(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void printInfo(int id)
    {
        System.out.print("ID: " + id + " ");
        printVars();
    }

    private void printVars()
    {
        System.out.println("Name: " + name + " Age: " + age);
    }
}

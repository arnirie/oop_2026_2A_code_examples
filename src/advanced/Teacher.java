package advanced;

public class Teacher {
    private String name;
    int age; //package-private
    protected String department;
    public int yearsOfService;
    private static int count;

    //init block
    //instance init block
    {
        name = "";
        age = 0;
        department = "";
        yearsOfService = 0;
        IO.println("instance init block");
    }

    //static init block
    static {
        count = 0;
        IO.println("static init block");
    }

    public Teacher(){
        IO.println("constructor called");
    }


}

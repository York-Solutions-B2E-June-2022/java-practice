import java.security.spec.ECField;

class Person {

    // by default a variable or function if not marked will be public
    String name;

    // if a function or variable is make a private that function or variable is only accessible withing the class it is defined in
    private int age = 30;

    // this is a getter, a getter is just a plain function that returns the private data so other class's can see what is stored
    public int getAge() {
        return age;
    }

    // this is a setter, a setter is just a plain function that allow others classes to "set" data on a private variable
    // this allows you to validate that the data is "acceptable" before it is stored on the object created from the class "blueprint"
    public void setAge(int age) throws Exception  {
        if (age < 1) {
            // An Exception is an object created from a class "blueprint" that reps an "error" or issues with what your
            // program was asked to do
             Exception exception = new Exception("age must be larger than 0");

             // throw functions like a return in that it will stop the function from continuing
             // to read the code after the keyword
             throw exception;
        }

        if (age > 150) {
            throw new Exception("age must be smaller than 150"); // <-- this is the syntax I would normally use
        }

        // this.age refers to the variable stored on the class
        // age refers to the variable passed to the function
        this.age = age;
    }

    // TS EXAMPLE:
    /*
        constructor(private dataService: DataService) {}
    */
    public Person(String name) {
        this.name = name;
    }

    public void talk() {
        System.out.println(this.name + " says hello");
    }
}

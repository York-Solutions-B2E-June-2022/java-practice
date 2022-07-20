public class Main {

    /* JS VERSION
        function main(args) {
            console.log('hello world');
        }
     */

    // main is the "starting point" of a java application
    public static void main(String[] args) {
        // this is how you log something to the terminal in java
        System.out.println("hello world"); // console.log()

        // java is statically typed js is NOT
        // const foo = 'hello'
        // foo = 123

        String foo = "hello";
        // foo = 123     <--- this is not allowed in java (the typeof foo is a String, so it can ONLY hold strings)

        // the "new" keyword creates a new object from the class "blueprint"
        // once the object is created you can access its property's and methods

        // JS obj example  ----  foo = {hello: () => {returns "hello"} }
        // foo.hello();
        Practice practice = new Practice();
        String hello = practice.hello();
        System.out.println(hello);


        // a variable "bucket" is not the object created from the class "blueprint"
        // it is only there to "hold" or "store" the object created
        Person bucket = new Person("adam");
        bucket = new Person("bob");


        // objects created from the same blueprint are separate and do not affect each other
        Person person1 = new Person("joe");
        Person person2 = new Person("sally");
        person1.talk(); // <-- when this is called the "this.name" in the function body has the value "joe"
        person2.talk(); // <-- when this is called the "this.name" in the function body has the value "sally"


        Person myPerson = new Person("tim");
        System.out.println(myPerson.getAge());
        //myPerson.age = 1000;

        try {
            myPerson.setAge(2000);
            System.out.println("age was set");
        } catch (Exception e) { //  < -- "e" is a variable with the type Exception
            System.out.println(e.getMessage());
        }

        System.out.println(myPerson.getAge());
    }
}

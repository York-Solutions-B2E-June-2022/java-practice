public class Main {

    /* JS VERSION
        function main(args) {
            console.log('hello world');
        }
     */

    // main is the "starting point" of a java application
    public static void main(String[] args) throws Exception {
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



        // this is going to try to set the age prop on person obj to something that will throw an Exception
        // when something is "thown" inside of the try part of a try catch block the program will run the catch "function" and the thing that is thrown
        // will get stored in the "e" variable
        try {
            myPerson.setAge(-1);
            System.out.println("age was set");
        } catch (Exception e) { //  < -- "e" is a variable with the type Exception
            System.out.println(e.getMessage());
        }
        System.out.println(myPerson.getAge());


        // if you uncomment this function call it will crash your program
        // this is because foo is being run in the "main" function, and it throws an error
        // that is not handled
        // foo();
    }

    // bar() generates an exception and foo throws it
    static void foo() throws Exception{
        bar();
    }

    // baz() generates an exception and bar throws it
    static void bar() throws Exception {
        baz();
    }

    // setAge() generates an exception and baz throws it
    static void baz() throws Exception {
        Person person = new Person("bob");
        person.setAge(-1);
    }
}

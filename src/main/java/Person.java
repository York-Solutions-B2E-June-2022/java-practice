public class Person {

    String name;

    // TS EXAMPLE:
    /*
        constructor(private dataService: DataService) {}
    */
    public Person(String name) {
        this.name = name;
    }

    void talk() {
        System.out.println(this.name + " says hello");
    }
}

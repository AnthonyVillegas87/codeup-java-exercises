public class Person {

    private String name;
    private int age;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 100){
            this.age = 0;
        } else {
            this.age = age;
        }

    }

    public boolean isTeen() {
        return (age > 12 && age < 20);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello " + name);
    }


}

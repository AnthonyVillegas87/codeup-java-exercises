public class Dog {


    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    private String sound;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }



    private boolean vaccinated;

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }



    public void bark() {
      System.out.println(name + " goes " + sound);
    }

    public Dog(String name, String sound, int age, boolean vaccinated) {
        this.name = name;
        this.sound = sound;
        this.age = age;
        this.vaccinated = vaccinated;
        this.bark();
    }

}

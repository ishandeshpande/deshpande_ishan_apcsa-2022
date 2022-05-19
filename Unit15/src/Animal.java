class Animal
{
    void someSound()
    {
        System.out.print("Screeech ");
    }

}
class Cat extends Animal
{
    public Cat()
    {
        System.out.print("Meow ");
        super.someSound();
    }
}

class Garfield extends Cat
{
    public Garfield()
    {
        System.out.print("Lasagna ");
    }
}

class Main {
	
public static void main(String[] args) {
	Garfield garfield = new Garfield();
}

}
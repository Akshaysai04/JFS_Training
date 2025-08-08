abstract class Animal 
{
    abstract void makeSound();    
    void sleep()
    {
        System.out.println("Sleeping........");
    }
}
class Dog extends Animal()
{
    void makeSound()
    {
        System.out.println("dog barks: BOW ! BOW");
    }
}
class cat extends Animal()
{
    void makeSound(){
        System.out.println("Make sound");
    }
}
public class TestAnimal{
    public static void main(String[] args) {
        Animal a=new Dog();
        Animal b=new Cat();
            a.makeSound();
            
    }
}
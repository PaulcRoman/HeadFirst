package Cap16Generic;

import java.util.ArrayList;

public class TestGenerics1 {
    public static void main(String[] args) {
        new TestGenerics1().go();

    }

    public void go(){
        Animal[] animals = {new Dog(), new Cat(), new Dog()};
        Dog[] dogs = {new Dog(), new Dog(), new Dog()};
        takeAnimals(animals);
        takeAnimals(dogs);

        //polymorphic arguments and generics
//        ArrayList<Animal> animals1 = new ArrayList<>();
//        animals1.add(new Dog());
//        animals1.add(new Cat());
//        animals1.add(new Dog());
    }

    public void takeAnimals(Animal[] animals){
        for (Animal a : animals){
            a.eat();
        }
    }
    //polymorphic arguments and generics
//    public void takeAnimals(ArrayList<Animal> animals1){
//        for (Animal a : animals1){
//            a.eat();
//        }
//    }

    abstract class Animal{
        void eat(){
            System.out.println("animal eating");

        }
    }
    class Dog extends Animal{
        void bark(){

        }
    }
    class Cat extends Animal{
        void meow(){

        }
    }
}

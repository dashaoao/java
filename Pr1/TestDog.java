package Pr1;

public class TestDog {
    public static void main(String[] args) {
        Dog first;
        first = new Dog();
        Dog second = new Dog("Bobik"), third = new Dog(9);
        first.setAge(3);
        third.setName("Barbos");
        System.out.println(first);
        first.intoHumanAge();
        second.intoHumanAge();
        third.intoHumanAge();
    }
}

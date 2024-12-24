//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);  // Коло з радіусом 5
        Shape rectangle = new Rectangle(4, 6);  // Прямокутник з розмірами 4 і 6
        Shape triangle = new Triangle(3, 4);  // Трикутник з основою 3 і висотою 4

        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Triangle: " + triangle.area());

        // Створюємо масив тварин
        Animal[] animals = {
                new Dog(),  // Собака
                new Cat(),  // Кіт
                new Bird()   // Птах
        };

        // Виводимо інформацію про кожну тварину
        for (Animal animal : animals) {
            System.out.println(animal.info());
        }
    }
}
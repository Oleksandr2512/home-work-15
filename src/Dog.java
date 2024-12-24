public class Dog implements Animal {

    @Override
    public String makeSound() {
        return "Bark";  // Звук собаки
    }


    @Override
    public String foodType() {
        return "Meat";  // Їжа для собаки
    }


    @Override
    public String info() {
        return "A dog makes the sound '" + makeSound() + "' and eats " + foodType();
    }
}


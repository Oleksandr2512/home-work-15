public class Cat implements Animal {
    // Реалізація методу makeSound() для кота
    @Override
    public String makeSound() {
        return "Meow";  // Звук кота
    }

    // Реалізація методу foodType() для кота
    @Override
    public String foodType() {
        return "Fish";  // Їжа для кота
    }

    // Реалізація методу info() для виведення інформації про кота
    @Override
    public String info() {
        return "A cat makes the sound '" + makeSound() + "' and eats " + foodType();
    }
}

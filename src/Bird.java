public class Bird implements Animal {

    @Override
    public String makeSound() {
        return "Chirp";
    }


    @Override
    public String foodType() {
        return "Seeds";
    }


    @Override
    public String info() {
        return "A bird makes the sound '" + makeSound() + "' and eats " + foodType();
    }
}

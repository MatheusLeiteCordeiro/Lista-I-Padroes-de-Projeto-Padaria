public class SprinklesDecorator extends CakeDecorator {
    public SprinklesDecorator(Cake wrapped) {
        super(wrapped);
    }

    @Override
    public int getCost() {
        return wrapped.getCost() + 2;
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription() + " with sprinkles";
    }
}
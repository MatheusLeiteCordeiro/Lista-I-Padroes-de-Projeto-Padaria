public class MultiLayeredDecorator extends CakeDecorator {
    public MultiLayeredDecorator(Cake wrapped) {
        super(wrapped);
    }

    @Override
    public int getCost() {
        return wrapped.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return "Multi-layered " + wrapped.getDescription();
    }
}
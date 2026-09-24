public abstract class CakeDecorator extends Cake {
    protected final Cake wrapped;

    protected CakeDecorator(Cake wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public int getCost() {
        return wrapped.getCost();
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription();
    }
}
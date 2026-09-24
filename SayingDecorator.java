public class SayingDecorator extends CakeDecorator {
    private final String saying;

    public SayingDecorator(Cake wrapped, String saying) {
        super(wrapped);
        this.saying = saying;
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription() + " with saying \"" + saying + "\"";
    }

    // getCost() herdado: não altera o custo
}
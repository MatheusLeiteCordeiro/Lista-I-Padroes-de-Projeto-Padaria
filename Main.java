public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        // 1. Bolo de chocolate
        order.addCake(new ChocolateCake());

        // 2. Bolo de baunilha com o dizer "PLAIN!"
        order.addCake(new SayingDecorator(new VanillaCake(), "PLAIN!"));

        // 3. Bolo de baunilha com granulado com o dizer "FANCY"
        order.addCake(
            new SayingDecorator(
                new SprinklesDecorator(new VanillaCake()),
                "FANCY"
            )
        );

        // 4. Bolo de morango em várias camadas com granulado duplo
        //    e dois dizeres "One of" e "EVERYTHING"
        Cake fancy = new StrawberryCake();
        fancy = new SayingDecorator(fancy, "One of");
        fancy = new SayingDecorator(fancy, "EVERYTHING");
        fancy = new SprinklesDecorator(fancy);
        fancy = new SprinklesDecorator(fancy);
        fancy = new MultiLayeredDecorator(fancy);
        order.addCake(fancy);

        order.printOrder();
    }
}
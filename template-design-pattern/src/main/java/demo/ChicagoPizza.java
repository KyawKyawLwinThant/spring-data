package demo;

public class ChicagoPizza extends PizzaTemplate{
    @Override
    public void prepared() {
        System.out.println("Chicago::prepared.");
    }

    @Override
    public void bake() {
        System.out.println("Chicago::bake.");
    }

    @Override
    public void topping() {
        System.out.println("Chicago::topping");
    }

    @Override
    public void serve() {
        System.out.println("Chicago::serve");
    }

    @Override
    public void checkBill() {
        System.out.println("Chicago::checkBill");
    }
}

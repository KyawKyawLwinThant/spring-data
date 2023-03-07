package demo;

public class NewYorkPizza extends PizzaTemplate {
    @Override
    public void prepared() {
        System.out.println("NewYork::prepared.");
    }

    @Override
    public void bake() {
        System.out.println("NewYork::baked");
    }

    @Override
    public void topping() {
        System.out.println("NewYork::topping");
    }

    @Override
    public void serve() {
        System.out.println("NewYork::serve");
    }

    @Override
    public void checkBill() {
        System.out.println("NewYork::checkBill");
    }
}

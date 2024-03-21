import java.util.List;

public class HotDrincsAuto implements VendingMachine {
    List<HotDrink> hotDrink;

    public HotDrincsAuto(List<HotDrink> products) {
        this.hotDrink = products;
    }

    public List<HotDrink> gethotDrink() {
        return hotDrink;
    }

    public void sethotDrink(List<HotDrink> hotDrink) {
        this.hotDrink = hotDrink;
    }

    @Override
    public Product getProduct(String name) {
        for (HotDrink item : hotDrink) {
            if(item.getName().equals(name))
                return item;
        }
        return null;
    }
    public Product getProduct(String name, double volume, int temperature){
        for (HotDrink drink : hotDrink) {
            if(drink.getName().equals(name) && drink.getVolume() == volume && drink.getTemperature() == temperature)
                return drink;
        }
        return null;
    }
    public void addHotDrink(HotDrink hotDrink){
        this.hotDrink.add(hotDrink);
    }

    @Override
    public Product getProduct(String name, double volume) {
        return null;
    }

}

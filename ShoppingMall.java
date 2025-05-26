package dddd;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ShoppingMall {
    private static Map<Class<? extends Fruit>, Fruit> registry = new HashMap<>();

    public static void register(Class<? extends Fruit> clazz, Fruit fruit) {
        registry.put(clazz, fruit);
    }


    public static Fruit getFruit(Fruit fruit) {
        Fruit fruit1 = registry.get(fruit.getClass());
        if (fruit1 != null) {
            return fruit1;
        }
        return null;
    }
}
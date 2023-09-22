package org.example;

import java.util.LinkedList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        var washingMachine = new WashingMachine(100, 100);
        var unwashedWashables = new LinkedList<>(List.of(
                new Shirt("black", 80),
                new Pants("leather", 50, false),
                new Pants("matte", 85, true)
        ));

        System.out.printf("Washables before washing: %s%n", unwashedWashables);

        unwashedWashables.forEach(washingMachine::load);

        var washedWashables = washingMachine.wash();
        System.out.printf("%nWashables after washing: %s%n", washedWashables);

        washedWashables.stream()
            .filter(Washable::shouldBeWashed)
            .forEach(w -> System.out.printf("One unit of %s should be washed again!", w.getClass().getSimpleName()));
    }
}
package pl.sda.sort.factory;

import pl.sda.sort.impl.BubbleSort;
import pl.sda.sort.impl.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort sorter = SortFactory.produce(SortTypeEnum.BUBBLE);

        int[] array = new int[] {5,3,0,-11,55,-99};
        int[] result = sorter.sort(array);

        //System.out.println(Arrays.toString(result));

        Planets earth = Planets.EARTH;
        System.out.println(earth.getCircumference());

    }
}

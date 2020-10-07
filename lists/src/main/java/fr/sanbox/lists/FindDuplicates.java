package fr.sanbox.lists;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FindDuplicates {
    /**
     * Finds integers in list which have the number of duplicate specified in arg.
     */
    public static List<Integer> findDuplicates(final List<Integer> list, final int numberOfDuplicates) {
        return findDuplicates(Integer.class, list, numberOfDuplicates);
    }

    /**
     * Finds objects in list which have the number of duplicate specified in arg
     *
     * @param clazz              Type of of object in the list
     * @param list
     * @param numberOfDuplicates
     * @return Duplicates integer as List
     */
    public static <T> List<T> findDuplicates(final Class<T> clazz, final List<T> list, final int numberOfDuplicates) {
        List<T> result = list.stream()
                .filter(e -> e != null)                                    // filter null entry
                .collect(groupingBy(identity(), counting()))    // create an association entity<->nbOfInteger
                .entrySet().stream()                                       // stream the map
                .filter(mapEntityCount -> mapEntityCount.getValue() == numberOfDuplicates) // filter with nbOfInteger
                .map(Map.Entry::getKey)                                     // only map the key
                .collect(Collectors.toList());
        return result;
    }


}

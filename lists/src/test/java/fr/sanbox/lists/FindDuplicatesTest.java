package fr.sanbox.lists;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FindDuplicatesTest {

    @Test
    public void findDuplicates_smoke() {
        List<Integer> list = FindDuplicates.findDuplicates(Arrays.asList(-1, 1, 4, 2, 2, 2, 5, 7, -1, 4, 7), 2);

        Assert.assertArrayEquals(list.toArray(), new Integer[]{-1, 4, 7});
    }

    @Test
    public void findDuplicates_with_null() {
        List<Integer> list = FindDuplicates.findDuplicates(Arrays.asList(-1, -1, 4, -1, 4, null, 4, null), 3);

        Assert.assertArrayEquals(list.toArray(), new Integer[]{-1, 4});
    }

}

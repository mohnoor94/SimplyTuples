package com.abukhleif.simplytuples.type;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Helper {

    static <T> Map<Integer, T> toMap(int keysStart, List<T> list) {
        return toMap(buildKeys(keysStart, list.size()), list);
    }

    static <T, U> Map<T, U> toMap(List<T> keys, List<U> values) {
        assert values.size() == keys.size() : "keys must be of the same size of the tuple";
        return IntStream.range(0, values.size())
                .boxed()
                .collect(Collectors.toMap(keys::get, values::get));
    }

    private static List<Integer> buildKeys(int start, int size) {
        return IntStream.range(start, size + start).boxed().collect(Collectors.toList());
    }
}
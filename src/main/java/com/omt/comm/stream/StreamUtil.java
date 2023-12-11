package com.omt.comm.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamUtil {
    /**
     * @description: 转换对象里面的参数 DefConvert.streamToList(list, p -> p.getDeviceId());
     * @param:
     * @return:
     * @author: owen
     * @date: 2020/3/31
     */
    public static <T, R> List<R> streamFilterToList(
            List<T> list, Predicate<? super T> predicate, Function<T, R> function) {
        // 校验数据是否为空
        if (list != null) {
            return list.stream().filter(predicate).map(function).collect(Collectors.toList());
        }

        return new ArrayList<>(0);
    }

}

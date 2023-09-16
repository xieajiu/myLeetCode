package com.xieajiu;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.util.ArrayUtil;
import com.google.common.base.Stopwatch;
import org.junit.Test;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class Solution0011Test {

    private final Solution0011 solution = new Solution0011();

    @Test
    public void testCase01() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        assertEquals(49, solution.maxArea(height));
        assertEquals(49, solution.maxAreaWithDoublePoint(height));
    }

    @Test
    public void testCase02() {
        int[] height = {1, 1};
        assertEquals(1, solution.maxArea(height));
        assertEquals(1, solution.maxAreaWithDoublePoint(height));
    }

    @Test
    public void testCase03() {
        FileReader fileReader = FileReader.create(FileUtil.file("classpath:Solution0011_testCase_data.txt"));
        int[] height = fileReader.read(bufferedReader ->
                bufferedReader.lines()
                        .map(line -> Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray())
                        .reduce(ArrayUtil::addAll)
                        .orElse(new int[]{1, 1}));
        Stopwatch stopwatch = Stopwatch.createStarted();
        assertEquals(705634720, solution.maxArea(height));
        stopwatch.stop();
        System.out.println("maxArea：" + stopwatch.elapsed(TimeUnit.NANOSECONDS) + "ns");
        stopwatch.reset().start();
        assertEquals(705634720, solution.maxAreaWithDoublePoint(height));
        stopwatch.stop();
        System.out.println("maxAreaWithDoublePoint：" + stopwatch.elapsed(TimeUnit.NANOSECONDS) + "ns");
    }


}
package com.javanoo6.oop.lesson7.task1;

public class TimeIntervalRunner {
    public static void main(String[] args) {
        var timeInterval = new TimeInterval(42, 2, 1);
        timeInterval.printTotalSeconds();
        System.out.println(timeInterval);

        var timeIntervalTheSecond = new TimeInterval(timeInterval.getTotalSeconds());
        timeIntervalTheSecond.printTotalSeconds();
        timeInterval.print();

        var sumIntervals = timeInterval.sum(timeIntervalTheSecond);
        sumIntervals.print();

        var easterEggTimeInterval = new TimeInterval(-1);
    }
}

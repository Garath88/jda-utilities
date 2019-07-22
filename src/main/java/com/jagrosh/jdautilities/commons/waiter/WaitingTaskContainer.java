package com.jagrosh.jdautilities.commons.waiter;

import java.util.concurrent.ScheduledFuture;

import com.jagrosh.jdautilities.commons.waiter.EventWaiter.WaitingEvent;

public class WaitingTaskContainer {
    private final WaitingEvent waitingEvent;
    private final ScheduledFuture<?> task;

    WaitingTaskContainer(WaitingEvent waitingEvent, ScheduledFuture<?> task) {
        this.waitingEvent = waitingEvent;
        this.task = task;
    }

    WaitingEvent getWaitingEvent() {
        return waitingEvent;
    }

    public ScheduledFuture<?> getTask() {
        return task;
    }
}

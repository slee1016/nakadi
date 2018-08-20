package org.zalando.nakadi.exceptions.runtime;

public class NoStreamingSlotsAvailable extends NakadiRuntimeBaseException {
    public NoStreamingSlotsAvailable(final int totalSlots) {
        super("No free slots for streaming available. Total slots: " + totalSlots);
    }
}

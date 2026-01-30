package JUNIT.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class PerformanceTaskTest {

    PerformanceTask task = new PerformanceTask();

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testLongRunningTaskTimeout() throws InterruptedException {
        task.longRunningTask();
    }
}


package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR1QueueTest {
    PR1Queue pr1q;

    private int f(int x) {
        return x*x + 3*x + 2;
    }

    private void fillQueue() {
        for(int x=0; x<15; x++){
            pr1q.add(f(x));
        }
    }

    @Before
    public void setUp() {
        pr1q = new PR1Queue();
        assertNotNull(pr1q.getQueue());
        fillQueue();
    }

    @After
    public void release() {
        pr1q = null;
    }

    @org.junit.Test
    public void queueTest() {
        assertEquals(15, pr1q.getQueue().size());
        Assert.assertEquals(Integer.valueOf(2), pr1q.poll());
        Assert.assertEquals(Integer.valueOf(6), pr1q.poll());
        Assert.assertEquals(Integer.valueOf(12), pr1q.poll());
        Assert.assertEquals(Integer.valueOf(20), pr1q.poll());
        Assert.assertEquals(Integer.valueOf(30), pr1q.poll());
        Assert.assertEquals(Integer.valueOf(42), pr1q.poll());
        Assert.assertEquals(Integer.valueOf(56), pr1q.poll());
        Assert.assertEquals(Integer.valueOf(72), pr1q.poll());
        Assert.assertEquals(Integer.valueOf(90), pr1q.poll());
        Assert.assertEquals(Integer.valueOf(110), pr1q.poll());
        Assert.assertEquals(Integer.valueOf(132), pr1q.poll());
        Assert.assertEquals(Integer.valueOf(156), pr1q.poll());
        Assert.assertEquals(Integer.valueOf(182), pr1q.poll());
        Assert.assertEquals(Integer.valueOf(210), pr1q.poll());
        Assert.assertEquals(Integer.valueOf(240), pr1q.poll());
        assertEquals(0, pr1q.getQueue().size());
    }
}

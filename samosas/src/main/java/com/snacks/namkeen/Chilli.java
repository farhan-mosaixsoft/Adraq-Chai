package com.snacks.namkeen;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by srikar on 10/6/16.
 */
public class Chilli {
    public int getChillies()  {
        return ThreadLocalRandom.current().nextInt(0, 4);
    }
}

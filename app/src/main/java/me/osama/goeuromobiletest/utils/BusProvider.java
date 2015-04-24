package me.osama.goeuromobiletest.utils;

import com.squareup.otto.Bus;

/**
 * Created by Osama Rao on 4/19/2015.
 */
public class BusProvider {
    public static Bus bus;

    public static Bus get() {
        if (bus == null)
            return new Bus();
        else
            return bus;

    }
}

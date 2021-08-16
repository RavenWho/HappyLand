/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;


import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class clockManager extends Clock {
    private ZonedDateTime begin;

    public clockManager() {
        begin = ZonedDateTime.now();
    }

    @Override
    public ZoneId getZone() {
        return ZoneId.systemDefault();
    }


    @Override
    public Clock withZone(ZoneId zone) {
        return null;
    }


    @Override
    public Instant instant() {
        // Gets 'now'.
        ZonedDateTime now = ZonedDateTime.now();
        long nowSeconds = now.toInstant().getEpochSecond();
        long beginSeconds = begin.toInstant().getEpochSecond();
        // Difference between the starting point of this clock and 'now'.
        long delta = nowSeconds - beginSeconds;
        // Creates a datetime that is in the future.
        return begin.plusSeconds(delta * 2).toInstant();
    }
}

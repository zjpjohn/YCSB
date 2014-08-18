package com.yahoo.ycsb.db;

/**
 * Created by Michael on 13.08.2014.
 */
public class DBObject {

    private volatile String key;
    private volatile long timeStamp;
    private volatile long expiration;
    private volatile boolean purged = false;

    public long getTimeStamp() {
        return timeStamp;
    }

    public DBObject(String key, long timeStamp) {
        this.key = key;
        this.timeStamp = timeStamp;
    }

    public DBObject(String key) {
        this.key = key;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getKey() {
        return key;
    }

    public long getExpiration() {
        return expiration;
    }

    public void setExpiration(long expiration) {
        this.expiration = expiration;
    }

    public boolean isPurged() {
        return purged;
    }

    public void setPurged(boolean purged) {
        this.purged = purged;
    }
}

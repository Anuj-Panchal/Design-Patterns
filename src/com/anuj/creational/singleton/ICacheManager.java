package com.anuj.creational.singleton;

public interface ICacheManager {

    Object getFromCache(String key);

    void addToCache(String key, Object value);

    void evictCache(String key);
}

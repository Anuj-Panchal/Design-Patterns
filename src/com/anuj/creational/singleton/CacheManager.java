package com.anuj.creational.singleton;

import java.util.HashMap;
import java.util.Map;

public class CacheManager implements ICacheManager{
    private static CacheManager cacheManager = null;
    Map<String, Object> cache;

    private CacheManager() {
        cache = new HashMap<>();
    }

    public static synchronized ICacheManager getInstance() {
        if(cacheManager == null)
            cacheManager = new CacheManager();
        return cacheManager;
    }

    @Override
    public Object getFromCache(String key) {
        return cache.get(key);
    }

    @Override
    public void addToCache(String key, Object value) {
        cache.put(key, value);
    }

    @Override
    public void evictCache(String key) {
        cache.remove(key);
    }
}

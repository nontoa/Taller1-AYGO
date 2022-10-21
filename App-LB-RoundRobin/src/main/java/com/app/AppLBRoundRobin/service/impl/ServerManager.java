package com.app.AppLBRoundRobin.service.impl;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ServerManager {

    private static AtomicInteger indexAtomic = new AtomicInteger(0);

    public volatile static Map<String, Integer> serverMap = new TreeMap<>();

    static {
        serverMap.put("log-service1", 1);
        serverMap.put("log-service2", 2);
        serverMap.put("log-service3", 3);
    }

    public static String getServer() {
        ArrayList<String> serverList = new ArrayList<>();
        Set<String> serverSet = ServerManager.serverMap.keySet();
        Iterator<String> iterator = serverSet.iterator();
        while(iterator.hasNext()){
            String server = iterator.next();
            Integer weight = ServerManager.serverMap.get(server);
            for (int i = 0; i < weight; i++) {
                serverList.add(server);
            }
        }

        if (indexAtomic.get() >= serverList.size()) {
            indexAtomic.set(0);
        }
        String server = serverList.get(indexAtomic.getAndIncrement());
        return server;
    }
}

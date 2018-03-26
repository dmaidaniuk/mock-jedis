package com.fiftyonred.mock_jedis;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisSentinelPool;

import java.util.Set;

public class MockJedisSentinelPool extends JedisSentinelPool {

    private MockJedis client = null;

    public MockJedisSentinelPool(String masterName, Set<String> sentinels, GenericObjectPoolConfig poolConfig) {
        super(masterName, sentinels, poolConfig);
    }

    public MockJedisSentinelPool(String masterName, Set<String> sentinels) {
        super(masterName, sentinels);
    }

    public MockJedisSentinelPool(String masterName, Set<String> sentinels, String password) {
        super(masterName, sentinels, password);
    }

    public MockJedisSentinelPool(String masterName, Set<String> sentinels, GenericObjectPoolConfig poolConfig, int timeout, String password) {
        super(masterName, sentinels, poolConfig, timeout, password);
    }

    public MockJedisSentinelPool(String masterName, Set<String> sentinels, GenericObjectPoolConfig poolConfig, int timeout) {
        super(masterName, sentinels, poolConfig, timeout);
    }

    public MockJedisSentinelPool(String masterName, Set<String> sentinels, GenericObjectPoolConfig poolConfig, String password) {
        super(masterName, sentinels, poolConfig, password);
    }

    public MockJedisSentinelPool(String masterName, Set<String> sentinels, GenericObjectPoolConfig poolConfig, int timeout, String password, int database) {
        super(masterName, sentinels, poolConfig, timeout, password, database);
    }

    public MockJedisSentinelPool(String masterName, Set<String> sentinels, GenericObjectPoolConfig poolConfig, int timeout, String password, int database, String clientName) {
        super(masterName, sentinels, poolConfig, timeout, password, database, clientName);
    }

    public MockJedisSentinelPool(String masterName, Set<String> sentinels, GenericObjectPoolConfig poolConfig, int timeout, int soTimeout, String password, int database) {
        super(masterName, sentinels, poolConfig, timeout, soTimeout, password, database);
    }

    public MockJedisSentinelPool(String masterName, Set<String> sentinels, GenericObjectPoolConfig poolConfig, int connectionTimeout, int soTimeout, String password, int database, String clientName) {
        super(masterName, sentinels, poolConfig, connectionTimeout, soTimeout, password, database, clientName);
    }

    @Override
    public Jedis getResource() {
        if (client == null) {
            client = new MockJedis("localhost");
        }
        return client;
    }

    @Override
    public void returnBrokenResource(Jedis resource) {

    }

    @Override
    public void returnResource(Jedis resource) {

    }
}

package com.fiftyonred.mock_jedis;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisSentinelPool;

import java.util.Collections;

import static org.junit.Assert.assertNotNull;

public class MockJedisSentinelPoolTest {

    @Test
    public void testPool() {
        JedisSentinelPool pool = new MockJedisSentinelPool("mymaster", Collections.singleton("localhost:26379"), new JedisPoolConfig());
        Jedis jedis = pool.getResource();
        assertNotNull(jedis);
        pool.returnResource(jedis);
    }
}

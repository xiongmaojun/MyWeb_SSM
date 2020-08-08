package com.sgy.redis;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class RedisTest {
	
	@Test
	public void redisTest01() {
		Jedis jedis = new Jedis();
		jedis.set("A01", "one");
		System.out.println(jedis.get("A01"));
	}

}

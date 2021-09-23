package config;

import commands.RedisCommandsBtt;
import commands.RedisCommandsBttHash;
import commands.RedisCommandsBttList;
import commands.RedisCommandsBttSet;
import commands.RedisCommandsBttString;
import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;
import java.util.HashMap;
import java.util.Map;

public class RedisService {
	private static final RedisService INSTANCE = new RedisService();

	private StatefulRedisConnection<String, String> connection;
	private Map<String, RedisCommandsBtt> deserializersMap = new HashMap<>();

	private RedisService() {
		RedisClient redisClient = RedisClient
				.create("redis-sentinel://pass@domen#mymaster");
		connection = redisClient.connect();

		deserializersMap.put(RedisDataTypes.STRING.toString(), new RedisCommandsBttString());
		deserializersMap.put(RedisDataTypes.HASH.toString(), new RedisCommandsBttHash());
		deserializersMap.put(RedisDataTypes.LIST.toString(), new RedisCommandsBttList());
		deserializersMap.put(RedisDataTypes.SET.toString(), new RedisCommandsBttSet());
	}


	public static RedisService getInstance() {
		return INSTANCE;
	}

	public RedisCommands<String, String> getConnection() {
		return connection.sync();
	}

	public Map<String, RedisCommandsBtt> getDeserializersMap() {
		return deserializersMap;
	}

}

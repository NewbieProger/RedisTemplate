package config;

import java.util.stream.Stream;

//Типы данных, которые могут храниться в Redis
public enum RedisDataTypes {
	HASH,
	STRING,
	SET,
	ZSET,
	LIST,
	STREAM;

	public static Stream<RedisDataTypes> stream() {
		return Stream.of(RedisDataTypes.values());
	}

	@Override
	public String toString() {
		return super.name().toLowerCase();
	}
}

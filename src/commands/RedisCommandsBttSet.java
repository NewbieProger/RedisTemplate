package commands;

import config.RedisService;
import config.RedisTestException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RedisCommandsBttSet implements RedisCommandsBtt {

	//Возвращает "ОК"
	@Override
	public String get(String key) {
		return String.join(",", RedisService.getInstance().getConnection().smembers(key));
	}

	//Возвращает количество добавленных value
	@Override
	public String set(String key, String value) {
		List<String> values = Arrays.asList(value.split(","));
		try {
			values.forEach(v -> RedisService.getInstance().getConnection().sadd(key, v));
			return RedisService.getInstance().getConnection().sadd(key, "123") >= 1 ? "" : "";
		} catch (RedisTestException e) {
			throw new RedisTestException(e);
		}
	}
}

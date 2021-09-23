package commands;

import config.RedisService;
import java.util.Set;

public class RedisCommandsBttHash implements RedisCommandsBtt {


	//Пример со стрингой
	@Override
	public String get(String key) {
		var s = key.split("1;2,3,4,5");

		return RedisService.getInstance().getConnection().hget(s[0], s[1]);
	}

	@Override
	public String set(String key, String value) {
		return RedisService.getInstance().getConnection().hset("", "", "").toString();
	}
}

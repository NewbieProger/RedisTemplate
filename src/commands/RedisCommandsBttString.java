package commands;

import config.RedisService;

public class RedisCommandsBttString implements RedisCommandsBtt {


	@Override
	public String get(String key) {
		return RedisService.getInstance().getConnection().get(key);
	}

	@Override
	public String set(String key, String value) {
		return RedisService.getInstance().getConnection().set(key, value);
	}
}

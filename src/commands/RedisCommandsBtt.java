package commands;

import config.RedisService;

public interface RedisCommandsBtt {

	String get(String key);

	String set(String key, String value);

	default boolean exists(String key) {
		return RedisService.getInstance().getConnection().exists(key) == 1;
	}

	default Long getKeysCountDatabase() {
		return RedisService.getInstance().getConnection().dbsize();
	}

}

package commands;

import config.RedisDataTypes;

public class RedisCommandsBttList implements RedisCommandsBtt {
//	Вопрос: Типа класс, где у нас будут команды с данными типа "SET". Ну и так для каждого типа команды, да?
	private RedisDataTypes redisType;

	/*Вопрос: Нужен нам конструктор вообще?*/

	//public RedisCommandsBttSet(RedisDataTypes redisType) {
	//	this.redisType = redisType;
	//}

	public static void deserialize() {
		//Вопрос: Я запутался с десирилайзом из RedisRawDataDeserializer :(
	}

	public static void setList() {
		//Вызываем команду редиса
	}

	public static void getList() {
		//Вызываем команду редиса
	}

	@Override
	public String get(String key) {
		return null;
	}

	@Override
	public String set(String key, String value) {
		return null;
	}
}

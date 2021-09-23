package config;

//Исполнитель комманд в Redis
public class RedisDataExecutor {

	/*Обращаемся к интерфейсу, и в зависимости от типа десериализатора,
	 который получили из мапы, вызываем соответствующий гет*/
	public static String executeCommandGet(String key) {

		return String.valueOf(RedisRawDataDeserializer.getDeserializerGetter(key).get(key));

	}

	/*Обращаемся к интерфейс, и в зависимости от типа десериализатора,
	 который получили из мапы, вызываем соответсвующий Set*/
	//public static String executeCommandSet(String typeOfValue, String key, String value) {
	//	return RedisRawDataDeserializer.getDeserializerSetter(typeOfValue).set(key, value);
	//
	//}

	//Проверяет наличие ключа в Redis
	public static boolean executeCommandExists(String key) {
		return RedisRawDataDeserializer.getDeserializerGetter(key).exists(key);
	}
}

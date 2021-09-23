package config;


import commands.RedisCommandsBtt;
import commands.RedisCommandsBttHash;
import java.util.Collections;

public class RedisRawDataDeserializer {

	//Получаем объект класса , который будет set и get делать
	public static RedisCommandsBtt getDeserializerGetter(String key) {
		if (canDeserialize(getTypeOfValue(key))) {
			return RedisService.getInstance().getDeserializersMap().get(getTypeOfValue(key));
		} else {
			throw new RedisTestException("Can't deserialize type of key: " + getTypeOfValue(key) + ". Please, check the key and its case");
		}
	}

	//public static RedisCommandsBtt getDeserializerSetter(String typeOfData) {
	//	if (canDeserialize(getTypeOfValue(typeOfData))) {
	//		return RedisService.getInstance().getDeserializersMap().get(getTypeOfValue(typeOfData));
	//	} else {
	//		throw new RedisTestException("Can't deserialize type of key: " + getTypeOfValue(typeOfData) + ". Please, check the key and its case");
	//	}
	//}

	//Проверяем тип данных из редиса с Enum типов.
	private static boolean canDeserialize(String typeOfKey) {
		return RedisDataTypes.stream()
				.anyMatch(r -> r.toString().equals(typeOfKey));
	}

	//Получаем тип данных из Redis, чтобы получить десериализатор
	private static String getTypeOfValue(String key) {
		return RedisService.getInstance().getConnection().type(key);
	}

	public static Long getKeysCountDatabase() {
		return RedisService.getInstance().getConnection().dbsize();
	}



}

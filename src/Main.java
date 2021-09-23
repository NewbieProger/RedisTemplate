import config.RedisDataExecutor;
import io.lettuce.core.RedisClient;
import io.lettuce.core.api.StatefulRedisConnection;

public class Main {
	public static void main(String[] args) {
		//
		//RedisClient redisClient = RedisClient.create("redis-sentinel://pass@domen#mymaster");
		//StatefulRedisConnection<String, String> connection = redisClient.connect();
		//connection.sync().flushall(FlushMode.SYNC);
		//
		//connection.sync().hset("HashList", "HashKey", "HashValue");
		//connection.sync().hset("HashList", "HashKey2", "HashValue2");
		//connection.sync().hgetall("HashList");
		//String response = Arrays.toString(connection.sync().dump("HashList"));
		//StatefulRedisConnection<String, String> connection = redisClient.connect();
		//connection.sync().info("HashList");
		//connection.sync().exists("Set1");
		//
		//
		//String key = "333";
		//connection.sync().set("Set", "SetValue");
		//connection.sync().hset("HSet", "HSetValue1", "HSetValue2");
		//connection.sync().rpush("List", "ListValue", "ListValue");
		//connection.sync().zadd("SortedSet", 1, "SortedSetValue");//Сортед
		//connection.sync().dbsize();//Кол-во ключей (просто Long)
		//connection.sync().keys("*");//Названия ключей и их количество
		//
		//String value = connection.sync().get(key);
		//System.out.println("Что-то там:" + value);
		//System.out.println(connection.sync().lindex("444", 456));
		//Map<String, String> q = new HashMap<>();
		//q.put("qwe", "asd");
		//for (int i = 0; i < 100; i++) {
		//	connection.sync().hset(String.valueOf(i), q);
		//}
		//
		//connection.sync().flushall(FlushMode.SYNC);//Удаляем все из всех БД
		//connection.sync().type("13");//Получаем количество ключей в БД
		//redisClient.shutdown();

		System.out.println(RedisDataExecutor.executeCommandGet("Set"));
	}

}

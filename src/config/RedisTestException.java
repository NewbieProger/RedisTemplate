package config;

public class RedisTestException extends RuntimeException {
	public RedisTestException(String message, Throwable cause) {
		super(message, cause);
	}

	public RedisTestException(String message) {
		super(message);
	}

	public RedisTestException(Throwable cause) {
		super(cause);
	}
}

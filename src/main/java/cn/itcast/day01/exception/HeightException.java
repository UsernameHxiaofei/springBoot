package cn.itcast.day01.exception;

/**
 * 自定义一个异常类事项exception接口
 *
 * 异常的体系 Throwable  error  exception
 */
public class HeightException extends Exception{
    public HeightException(String message) {
        super(message);
    }
}

package br.com.email.consumer.interfaces;

public interface AmqpConsumer<T> {
    void consumer(T t);
}

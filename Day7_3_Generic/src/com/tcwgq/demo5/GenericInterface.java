package com.tcwgq.demo5;
/**
 * 泛型接口：将泛型定义在接口上。
 * @author lenovo
 *
 */
/**
 * 两种实现方式：
 * 1.实现类在实现时确定泛型类型
 * 2.实现类在实现时不确定泛型类型
 * @author lenovo
 *
 * @param <T>
 */
public interface GenericInterface<T> {
	public abstract void show(T t);
}

package com.tcwgq.demo6;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5159335255916920773L;
	/**
	 * NotSerializableException:当实例需要具有序列化接口时，抛出此异常。序列化运行时或实例的类会抛出此异常。
	 * Serializable:类通过实现 java.io.Serializable 接口以启用其序列化功能。未实现此接口的类将无法使其任何状态序列化或反序列化。
	 * 该接口没有任何方法，像这种没有方法的借口成为标记接口。
	 * @throws IOException
	 */
	/**
	 * java.io.InvalidClassException: com.tcwgq.demo6.User; 
	 * local class incompatible: stream classdesc serialVersionUID = -83569362223871759, 
	 * local class serialVersionUID = 5159335255916920773
	 */
	/**
	 * 序列化运行时使用一个称为 serialVersionUID 的版本号与每个可序列化类相关联，
	 * 该序列号在反序列化过程中用于验证序列化对象的发送者和接收者是否为该对象加载了与序列化兼容的类。
	 * 如果接收者加载的该对象的类的 serialVersionUID 与对应的发送者的类的版本号不同，
	 * 则反序列化将会导致 InvalidClassException。
	 * 可序列化类可以通过声明名为 "serialVersionUID" 的字段（该字段必须是静态 (static)、最终 (final) 的 long 型字段）显式声明其自己的 serialVersionUID：
     * ANY-ACCESS-MODIFIER static final long serialVersionUID = 42L;
     * 如果可序列化类未显式声明 serialVersionUID，
     * 则序列化运行时将基于该类的各个方面计算该类的默认 serialVersionUID 值，
     * 如“Java(TM) 对象序列化规范”中所述。
     * 不过，强烈建议 所有可序列化类都显式声明 serialVersionUID 值，
     * 原因是计算默认的 serialVersionUID 对类的详细信息具有较高的敏感性，
     * 根据编译器实现的不同可能千差万别，这样在反序列化过程中可能会导致意外的 InvalidClassException。
     * 因此，为保证 serialVersionUID 值跨不同 java 编译器实现的一致性，
     * 序列化类必须声明一个明确的 serialVersionUID 值。
     * 还强烈建议使用 private 修饰符显示声明 serialVersionUID（如果可能），
     * 原因是这种声明仅应用于直接声明类 -- serialVersionUID 字段作为继承成员没有用处。
     * 数组类不能声明一个明确的 serialVersionUID，
     * 因此它们总是具有默认的计算值，但是数组类没有匹配 serialVersionUID 值的要求。 
	 */
	/**
	 * 针对类中不想实现序列化的成员变量，我们使用关键字transient。
	 */
	private String username;
	private transient String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}

}

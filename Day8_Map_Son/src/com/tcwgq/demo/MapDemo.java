package com.tcwgq.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/**
 * Map接口概述：将键映射到值的对象。一个映射不能包含重复的键；每个键最多只能映射到一个值。 
 */
/**
 * Map接口中的方法： 添加方法： V put(K key, V value)：将指定的值与此映射中的指定键关联（可选操作）。
 * 如果此映射以前包含一个该键的映射关系，则用指定值替换旧值（当且仅当 m.containsKey(k) 返回 true 时，才能说映射 m 包含键 k
 * 的映射关系）。 返回：与 key 关联的旧值；如果 key 没有任何映射关系，则返回 null。（返回 null 还可能表示该映射之前将 null 与
 * key 关联。）
 * 
 * void putAll(Map<? extends K,? extends V> m)：从指定映射中将所有映射关系复制到此映射中（可选操作）。
 * 对于指定映射中的每个键 k 到值 v 的映射关系，此调用等效于对此映射调用一次 put(k, v)。
 * 如果正在进行此操作的同时修改了指定的映射，则此操作的行为是不确定的
 * 
 * 删除方法： V remove(Object key)：如果存在一个键的映射关系，则将其从此映射中移除（可选操作）。 更确切地讲，如果此映射包含从满足
 * (key==null ? k==null :key.equals(k))的键 k到值 v的映射关系，则移除该映射关系。
 * （该映射最多只能包含一个这样的映射关系。） 返回此映射中以前关联该键的值，如果此映射不包含该键的映射关系，则返回 null。 如果此映射允许 null
 * 值，则返回 null 值并不一定 表示该映射不包含该键的映射关系；也可能该映射将该键显示地映射到 null。
 * 调用返回后，此映射将不再包含指定键的映射关系。
 * 
 * void clear()：从此映射中移除所有映射关系（可选操作）。此调用返回后，该映射将为空。
 * 
 * 获取方法： V get(Object key):返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null。 更确切地讲，如果此映射包含满足
 * (key==null ? k==null : key.equals(k)) 的键 k 到值 v 的映射关系， 则此方法返回 v；否则返回
 * null。（最多只能有一个这样的映射关系）。 如果此映射允许 null 值，则返回 null 值并不一定 表示该映射不包含该键的映射关系；
 * 也可能该映射将该键显示地映射到 null。使用 containsKey 操作可区分这两种情况。
 * 
 * int size():返回此映射中的键-值映射关系数。如果该映射包含的元素大于 Integer.MAX_VALUE，则返回
 * Integer.MAX_VALUE。
 * 
 * Set<K> keySet():返回此映射中包含的键的 Set 视图。该 set 受映射支持， 所以对映射的更改可在此 set 中反映出来，反之亦然。
 * 如果对该 set 进行迭代的同时修改了映射（通过迭代器自己的 remove 操作除外）， 则迭代结果是不确定的。set 支持元素移除， 通过
 * Iterator.remove、Set.remove、removeAll、retainAll 和 clear 操作可从映射中移除相应的映射关系。 它不支持
 * add或 addAll操作。
 * 
 * Set<Map.Entry<K,V>> entrySet():返回此映射中包含的映射关系的 Set 视图。 该 set 受映射支持，所以对映射的更改可在此
 * set 中反映出来，反之亦然。 如果对该 set 进行迭代的同时修改了映射（通过迭代器自己的 remove 操作，或者通过对迭代器返回的映射项执行
 * setValue 操作除外）， 则迭代结果是不确定的。set 支持元素移除， 通过
 * Iterator.remove、Set.remove、removeAll、retainAll 和 clear 操作可从映射中移除相应的映射关系。 它不支持
 * add 或 addAll 操作。
 * 
 * Collection<V> values():返回此映射中包含的值的 Collection视图。 该 collection
 * 受映射支持，所以对映射的更改可在此 collection 中反映出来，反之亦然。 如果对该 collection
 * 进行迭代的同时修改了映射（通过迭代器自己的 remove 操作除外），则迭代结果是不确定的。 collection 支持元素移除，通过
 * Iterator.remove、Collection.remove、removeAll、retainAll 和 clear
 * 操作可从映射中移除相应的映射关系。 它不支持 add 或 addAll 操作
 * 
 * 判断方法： boolean isEmpty():如果此映射未包含键-值映射关系，则返回 true。
 * 
 * boolean containsKey(Object key):如果此映射包含指定键的映射关系，则返回 true。 更确切地讲，当且仅当此映射包含针对满足
 * (key==null ? k==null : key.equals(k)) 的键 k 的映射关系时，返回 true。 （最多只能有一个这样的映射关系）。
 * 
 * boolean containsValue(Object value):如果此映射将一个或多个键映射到指定值，则返回 true。
 * 更确切地讲，当且仅当此映射至少包含一个对满足 (value==null ? v==null : value.equals(v)) 的值 v
 * 的映射关系时，返回 true。 对于大多数 Map 接口的实现而言，此操作需要的时间可能与映射大小呈线性关系。
 * 
 */
public class MapDemo {
	@Test
	public void fun() {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("aaa", "aaa");// 添加键值对元素
		hm.put("bbb", "bbb");
		hm.put("ccc", "ccc");
		hm.put("ddd", "ddd");
		// 与 key 关联的旧值；如果 key 没有任何映射关系，则返回 null。
		System.out.println(hm.put("eee", "eee"));// 返回null
		System.out.println(hm.put("eee", "eee"));// 返回eee
		System.out.println(hm.remove("aaa"));// 返回移除键对应的值
		// hm.clear();//清空集合中的所有键值对
		System.out.println(hm.get("aaa"));// 根据键返回对应的值
		System.out.println(hm.get("bbb"));
		System.out.println(hm.size());// 获取集合中的键值对数目
		System.out.println(hm.containsKey("aaa"));// 判断是否包含指定的key
		System.out.println(hm.containsKey("bbb"));
		System.out.println(hm.containsValue("ccc"));// 判断是否包含指定的Value
		System.out.println(hm);
	}

	// 高级功能测试
	/**
	 * Set<K> keySet():返回此映射中包含的键的 Set 视图。 
	 * Set<Map.Entry<K,V>> entrySet():返回此映射中包含的映射关系的 Set 视图。
	 * Collection<V> values():返回此映射中包含的值的Collection 视图。
	 */
	@Test
	public void fun1() {
		//Set<K> keySet():返回此映射中包含的键的 Set 视图。
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("aaa", "aaa");
		hm.put("bbb", "bbb");
		hm.put("ccc", "ccc");
		hm.put("ddd", "ddd");
		Set<String> set = hm.keySet();
		for (String key : set) {
			System.out.println(key + "---" + hm.get(key));
		}
	}
	/**
	 * Map.Entry<K,V>:
	 * 映射项（键-值对）。Map.entrySet 方法返回映射的 collection 视图，其中的元素属于此类。
	 * 方法：
	 * K getKey()返回与此项对应的键。
	 * V getValue()返回与此项对应的值。
	 */
	@Test
	public void fun2() {
		//Set<Map.Entry<K,V>> entrySet():返回此映射中包含的映射关系的 Set 视图。。
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("aaa", "aaa");
		hm.put("bbb", "bbb");
		hm.put("ccc", "ccc");
		hm.put("ddd", "ddd");
		Set<Map.Entry<String, String>> set = hm.entrySet();
		for(Map.Entry<String, String> entry : set){
			System.out.println(entry.getKey()+"---"+entry.getValue());
		}
	}
	
	@Test
	public void fun3() {
		//Collection<V> values():返回此映射中包含的值的Collection视图。
		//即返回集合中所有值
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("aaa", "aaa");
		hm.put("bbb", "bbb");
		hm.put("ccc", "ccc");
		hm.put("ddd", "ddd");
		Collection<String> c = hm.values();
		for(String s : c){
			System.out.println(s);
		}
	}
}

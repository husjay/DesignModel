package com.husjay.iterator;

/**
 * 自定义迭代器类
 * @author hsj
 *
 */
public interface MyIterator {
	
	void first();
	
	void next();
	
	boolean hasNext();
	
	boolean isFirst();
	
	boolean isLast();
	
	Object getCurrentObj();

}

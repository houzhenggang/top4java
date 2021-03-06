package com.taobao.top.mapping;

import com.taobao.top.TopException;
import com.taobao.top.domain.PageList;

/**
 * 动态格式转换器。
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public interface Converter {

	/**
	 * 把字符串转换为响应列表对象。
	 * 
	 * @param <T> 领域泛型
	 * @param rsp 响应字符串
	 * @param clazz 领域类型
	 * @param api 接口名称
	 * @return 响应列表对象
	 * @throws TopException
	 */
	public <T> PageList<T> toResponseList(String rsp, Class<T> clazz, String api) throws TopException;

	/**
	 * 把字符串转换为响应对象。
	 * 
	 * @param <T> 领域泛型
	 * @param rsp 响应字符串
	 * @param clazz 领域类型
	 * @param api 接口名称
	 * @return 响应对象
	 * @throws TopException
	 */
	public <T> T toResponse(String rsp, Class<T> clazz, String api) throws TopException;

}

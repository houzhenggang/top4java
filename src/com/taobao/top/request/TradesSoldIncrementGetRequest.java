package com.taobao.top.request;

import java.util.Date;
import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.trades.sold.increment.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TradesSoldIncrementGetRequest implements TopRequest {

	private Date endModified;
	private String fields;
	private Integer pageNo;
	private Integer pageSize;
	private Date startModified;
	private String status;
	private String tag;
	private String type;
	private Boolean useHasNext;

	public void setEndModified(Date endModified) {
		this.endModified = endModified;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public void setStartModified(Date startModified) {
		this.startModified = startModified;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setUseHasNext(Boolean useHasNext) {
		this.useHasNext = useHasNext;
	}

	public String getApiName() {
		return "taobao.trades.sold.increment.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("end_modified", this.endModified);
		params.put("fields", this.fields);
		params.put("page_no", this.pageNo);
		params.put("page_size", this.pageSize);
		params.put("start_modified", this.startModified);
		params.put("status", this.status);
		params.put("tag", this.tag);
		params.put("type", this.type);
		params.put("use_has_next", this.useHasNext);
		return params;
	}

}

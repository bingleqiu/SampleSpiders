package com.wanyun.SampleSpiders;

import java.security.Timestamp;
import java.util.Date;

public class URL {

	private String oriUrl; // Original Domain url, such as http://www.xxxxxx.com/aaa/bbb
	private String ipUrl;  // Ip url, such as http://150.237.59.35/aaa/bbb
	private int urlNo;		// URL number
	private int statusCode; // Response status code
	private int hitNum; 	// The number of urls that reference to this page
	private String charset;	// Charset of the page
	private String abstractText;	// Abstract of the file
	private String author;
	private int weight;		// How important of this file related to the target subject
	private String description;
	private int fileSize;
	private Timestamp lastUpdateTime;
	private Date timeToLive;
	private String title;
	private String type;
	private URL[] urlReferences;
	private int layer;		// Layer from the seek
	private String responseBody;
	
	public String getOriUrl() {
		return oriUrl;
	}
	public void setOriUrl(String oriUrl) {
		this.oriUrl = oriUrl;
	}
	public String getIpUrl() {
		return ipUrl;
	}
	public void setIpUrl(String ipUrl) {
		this.ipUrl = ipUrl;
	}
	public int getUrlNo() {
		return urlNo;
	}
	public void setUrlNo(int urlNo) {
		this.urlNo = urlNo;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public int getHitNum() {
		return hitNum;
	}
	public void setHitNum(int hitNum) {
		this.hitNum = hitNum;
	}
	public String getCharset() {
		return charset;
	}
	public void setCharset(String charset) {
		this.charset = charset;
	}
	public String getAbstractText() {
		return abstractText;
	}
	public void setAbstractText(String abstractText) {
		this.abstractText = abstractText;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getFileSize() {
		return fileSize;
	}
	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}
	public Timestamp getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(Timestamp lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public Date getTimeToLive() {
		return timeToLive;
	}
	public void setTimeToLive(Date timeToLive) {
		this.timeToLive = timeToLive;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public URL[] getUrlReferences() {
		return urlReferences;
	}
	public void setUrlReferences(URL[] urlReferences) {
		this.urlReferences = urlReferences;
	}
	public int getLayer() {
		return layer;
	}
	public void setLayer(int layer) {
		this.layer = layer;
	}
	public void setResponseBody(String respBody) {
		// TODO Auto-generated method stub
		this.responseBody = respBody;
	}
	public String getResponseBody(){
		return responseBody;
	}
	
}

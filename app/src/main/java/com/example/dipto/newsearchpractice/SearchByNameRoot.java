package com.example.dipto.newsearchpractice;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class SearchByNameRoot {

	@SerializedName("result")
	private String result;

	@SerializedName("msg")
	private String msg;

	@SerializedName("data")
	private List<SearchByNameProfile> data;

	public void setResult(String result){
		this.result = result;
	}

	public String getResult(){
		return result;
	}

	public void setMsg(String msg){
		this.msg = msg;
	}

	public String getMsg(){
		return msg;
	}

	public void setData(List<SearchByNameProfile> data){
		this.data = data;
	}

	public List<SearchByNameProfile> getData(){
		return data;
	}

	@Override
 	public String toString(){
		return 
			"SearchByNameRoot{" +
			"result = '" + result + '\'' + 
			",msg = '" + msg + '\'' + 
			",data = '" + data + '\'' + 
			"}";
		}
}
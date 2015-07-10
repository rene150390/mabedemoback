package com.mabe.wrappers;

public class WSetLoginUser extends WSimpleResult{
	
	private String id;
	private String apikey;
	private String name;
	
	public WSetLoginUser (){
		super("Fail");
	}
	
	public WSetLoginUser(String result, String id, String name, String apikey){
		super(result);
		setId(id);
		setApikey(apikey);
		setName(name);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getApikey() {
		return apikey;
	}

	public void setApikey(String apikey) {
		this.apikey = apikey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

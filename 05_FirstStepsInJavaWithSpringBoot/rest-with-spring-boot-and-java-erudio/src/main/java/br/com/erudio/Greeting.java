package br.com.erudio;

public class Greeting {

	public final long id;
	public final String content;
	
	public Greeting(long id, String content) {

		this.id = id;
		this.content = content;
	}
	
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
	
	
}

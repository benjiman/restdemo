package uk.co.benjiweber.restdemo.server;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonAutoDetect
public class Link {
	@JsonProperty
	private final String href;

	public Link(String string) {
		this.href = string;
	}

	public static Link link(String string) {
		return new Link(string);
	}

	@Override
	public String toString() {
		return href;
	}
	
}

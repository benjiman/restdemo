package uk.co.benjiweber.restdemo.server;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonAutoDetect
public class Campaign {
	public Campaign(String name, int id) {
		this.name = name;
		this.embedCode = Link.link("/embedcode?campaign=" + id + "&from=" + Campaign.class.getSimpleName());
	}

	@JsonProperty
	public String name;
	@JsonProperty
	public Link embedCode;
}

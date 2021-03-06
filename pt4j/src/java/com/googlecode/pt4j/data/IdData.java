package com.googlecode.pt4j.data;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * Describes a single Id with a default attribute type of "integer"
 *
 * @author jon stevens
 */
@XStreamAlias("id")
public class IdData
{
	private Long id;

	@XStreamAsAttribute
	private String type = "integer";

	/** */
	public IdData() {}

	/** */
	public IdData(Long id)
	{
		this.id = id;
	}

	/** */
	public IdData(Long id, String type)
	{
		this.id = id;
		this.type = type;
	}

	/** */
	public Long getId()
	{
		return this.id;
	}

	/** */
	public String getType()
	{
		return this.type;
	}
}

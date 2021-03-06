package com.googlecode.pt4j.data;

import org.joda.time.DateTime;

import com.googlecode.pt4j.util.DateTimeConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

/**
 * Describes a single Note
 *
 * @author jon stevens
 */
@XStreamAlias("note")
public class NoteData
{
	@XStreamAlias("id")
	private Long id;
	@XStreamAlias("text")
	private String text;
	@XStreamAlias("author")
	private String author;

	@XStreamAlias("noted_at")
//	@XStreamConverter(DateTimeConverter.class)
	private DateTime notedAt;

	/** */
	public NoteData() {}

	/** */
	public Long getId()
	{
		return this.id;
	}

	/** */
	public String getText()
	{
		return this.text;
	}

	/** */
	public String getAuthor()
	{
		return this.author;
	}

	/** */
	public DateTime getNotedAt()
	{
		return this.notedAt;
	}
}

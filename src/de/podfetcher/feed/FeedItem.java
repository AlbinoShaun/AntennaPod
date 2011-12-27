package de.podfetcher.feed;


/**
 * Data Object for a XML message
 * @author daniel
 *
 */
public class FeedItem extends FeedComponent{
	private String title;
	private String description;
	private String link;
	private String pubDate;
	private FeedMedia media;
	private Feed feed;
	private boolean read;

	public FeedItem() {
			this.read = false;
	}
	
	public FeedItem(String title, String description, String link,
			String pubDate, FeedMedia media, Feed feed) {
		super();
		this.title = title;
		this.description = description;
		this.link = link;
		this.pubDate = pubDate;
		this.media = media;
		this.feed = feed;
		this.read = false;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	public FeedMedia getMedia() {
		return media;
	}

	public void setMedia(FeedMedia media) {
		this.media = media;
	}

	public Feed getFeed() {
		return feed;
	}

	public void setFeed(Feed feed) {
		this.feed = feed;
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}
	
	
}
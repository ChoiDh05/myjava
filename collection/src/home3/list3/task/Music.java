package home3.list3.task;

import java.util.Objects;

public class Music {
	private String musicName;
	private String singer;
	private String kind;

	public void Music() {
		;
	}

	public Music(String musicName, String singer, String kind) {
		super();
		this.musicName = musicName;
		this.singer = singer;
		this.kind = kind;
	}

	public String getMusicName() {
		return musicName;
	}

	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Music [musicName=" + musicName + ", singer=" + singer + ", kind=" + kind + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		return kind.equals(other.kind) && musicName.equals(other.musicName) && singer.equals(other.singer);
	}

}

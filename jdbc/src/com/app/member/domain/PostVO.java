package com.app.member.domain;

import java.util.Objects;

public class PostVO {

	 private Long id;
	 private String postTitle;
	 private String postContet;
	 private Long memberId;
	 private String createdDate;
	 private String updatedDate;
	 
	 public PostVO() {;}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostContet() {
		return postContet;
	}

	public void setPostContet(String postContet) {
		this.postContet = postContet;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "PostVo [id=" + id + ", postTitle=" + postTitle + ", postContet=" + postContet + ", memberId=" + memberId
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PostVO other = (PostVO) obj;
		return Objects.equals(id, other.id);
	}

	 
	
	 
	 
}

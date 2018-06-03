package org.jk.mylibrary.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class UserIdResponse {

	private Long userId;
	private String roleName;

	public UserIdResponse(Long userId, String roleName) {
		super();
		this.userId = userId;
		this.roleName = roleName;
	}

	/**
	 * @return the userId
	 */
	public final Long getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public final void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * @return the roleName
	 */
	public final String getRoleName() {
		return roleName;
	}

	/**
	 * @param roleName
	 *            the roleName to set
	 */
	public final void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}

package cz.metacentrum.perun.core.api;

import java.util.Objects;

/**
 * Member candidate and error because of which add/invite operation failed.
 *
 * @author Sarka Palkovicova
 */
public class FailedCandidate {
	private MemberCandidate candidate;

	private String errorName;

	private String errorMessage;

	public FailedCandidate(MemberCandidate candidate, String errorName, String errorMessage) {
		this.candidate = candidate;
		this.errorName = errorName;
		this.errorMessage = errorMessage;
	}

	public MemberCandidate getCandidate() {
		return candidate;
	}

	public void setCandidate(MemberCandidate candidate) {
		this.candidate = candidate;
	}

	public String getErrorName() { return errorName; }

	public void setErrorName(String errorName) {
		this.errorName = errorName;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		FailedCandidate that = (FailedCandidate) o;
		return Objects.equals(candidate, that.candidate) && Objects.equals(errorName, that.errorName) && Objects.equals(errorMessage, that.errorMessage);
	}

	@Override
	public int hashCode() {
		return Objects.hash(candidate, errorName, errorMessage);
	}
}

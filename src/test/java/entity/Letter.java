package entity;

public class Letter {
	private String destinationAddress;
	private String themeLetter;
	private String bodyLetter;

	public Letter() {
		super();

	}

	public Letter(String whoSend, String themeLetter, String bodyLetter) {
		super();
		this.destinationAddress = whoSend;
		this.themeLetter = themeLetter;
		this.bodyLetter = bodyLetter;
	}

	public String getDestinationAddress() {
		return destinationAddress;
	}

	public void setDestinationAddress(String whoSend) {
		this.destinationAddress = whoSend;
	}

	public String getThemeLetter() {
		return themeLetter;
	}

	public void setThemeLetter(String themeLetter) {
		this.themeLetter = themeLetter;
	}

	public String getBodyLetter() {
		return bodyLetter;
	}

	public void setBodyLetter(String bodyLetter) {
		this.bodyLetter = bodyLetter;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bodyLetter == null) ? 0 : bodyLetter.hashCode());
		result = prime * result + ((themeLetter == null) ? 0 : themeLetter.hashCode());
		result = prime * result + ((destinationAddress == null) ? 0 : destinationAddress.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Letter other = (Letter) obj;
		if (bodyLetter == null) {
			if (other.bodyLetter != null)
				return false;
		} else if (!bodyLetter.equals(other.bodyLetter))
			return false;
		if (themeLetter == null) {
			if (other.themeLetter != null)
				return false;
		} else if (!themeLetter.equals(other.themeLetter))
			return false;
		if (destinationAddress == null) {
			if (other.destinationAddress != null)
				return false;
		} else if (!destinationAddress.equals(other.destinationAddress))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Lettter [whoSend=" + destinationAddress + ", themeLetter=" + themeLetter + ", bodyLetter=" + bodyLetter + "]";
	}

}

package abstractFactory;

public class Windows extends SistemaOperativo{
	
	private String version;
	
	public Windows() {
		
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String toString() {
		return super.toString() + " " + this.getId() + " " + this.version;
	}
}

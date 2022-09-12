package application;

public class Mountain {
	private int heightMetres = 8100;
	private double peakTemperature = 5;
	private String name = "K58";
	
	public Mountain(int heightMetres, double peakTemperature, String name) {
		super();
		this.heightMetres = heightMetres;
		this.peakTemperature = peakTemperature;
		this.name = name;
	}

	public int getHeightMetres() {
		return heightMetres;
	}

	public void setHeightMetres(int heightMetres) {
		this.heightMetres = heightMetres;
	}

	public double getPeakTemperature() {
		return peakTemperature;
	}

	public void setPeakTemperature(double peakTemperature) {
		this.peakTemperature = peakTemperature;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Mountain [heightMetres=" + heightMetres + ", peakTemperature=" + peakTemperature + ", name=" + name
				+ "]";
	}

}

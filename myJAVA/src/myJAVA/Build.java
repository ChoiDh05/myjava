package myJAVA;

public class Build {
	private GraphicsCard graphicsCard;
	private CPU cpu;
	private MainBoard mainboard;
	private Ram ram;
	private Power power;
	private PcCase PcCase;
	private Cooler cooler;
	
	public Build() {;}
	
//	public Build (Build build) {
//		this(build.getGraphicsCard(), build.getCpu(), build.getMainboard(), build.getRam(), build.getPower(), build.getbuildCase(),build.getCooler());
//	}

	public Build(String graphicsCard, String cpu, String mainboard, String ram, String power, String buildCase,
			String cooler) {
		this.graphicsCard = graphicsCard;
		this.cpu = cpu;
		this.mainboard = mainboard;
		this.ram = ram;
		this.power = power;
		this.PcCase = PcCase;
		this.cooler = cooler;
	}

//	public String getGraphicsCard() {
//		return graphicsCard;
//	}
//
//	public void setGraphicsCard(String graphicsCard) {
//		this.graphicsCard = graphicsCard;
//	}
//
//	public String getCpu() {
//		return cpu;
//	}
//
//	public void setCpu(String cpu) {
//		this.cpu = cpu;
//	}
//
//	public String getMainboard() {
//		return mainboard;
//	}
//
//	public void setMainboard(String mainboard) {
//		this.mainboard = mainboard;
//	}
//
//	public String getRam() {
//		return ram;
//	}
//
//	public void setRam(String ram) {
//		this.ram = ram;
//	}
//
//	public String getPower() {
//		return power;
//	}
//
//	public void setPower(String power) {
//		this.power = power;
//	}
//
//	public String getbuildCase() {
//		return buildCase;
//	}
//
//	public void setbuildCase(String buildCase) {
//		this.buildCase = buildCase;
//	}
//
//	public String getCooler() {
//		return cooler;
//	}
//
//	public void setCooler(String cooler) {
//		this.cooler = cooler;
//	}

	@Override
	public String toString() {
		return "build [graphicsCard=" + graphicsCard + ", cpu=" + cpu + ", mainboard=" + mainboard + ", ram=" + ram
				+ ", power=" + power + ", buildCase=" + buildCase + ", cooler=" + cooler + "]";
	}
	
	
}

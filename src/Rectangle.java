public class Rectangle {
	double chieuDai;
	private double chieuRong;

	public Rectangle(double chieu_dai, double chieu_rong) {
		chieuDai = chieu_dai;
		chieuRong = chieu_rong;
	}

	public double chuVi() {
		double chuVi;
		chuVi = 2 * (chieuDai + chieuRong);
		return chuVi;
	}
	public double dienTich() {
		double dienTich;
		dienTich =  (chieuDai * chieuRong);
		return dienTich;
	}
}

package org.zen.rest.datas;

public class ProductDTO {
	private int rno;
	private String rtitle;
	private int rprice;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getRtitle() {
		return rtitle;
	}
	public void setRtitle(String rtitle) {
		this.rtitle = rtitle;
	}
	public int getRprice() {
		return rprice;
	}
	public void setRprice(int rprice) {
		this.rprice = rprice;
	}
	@Override
	public String toString() {
		return "ProductDAO [rno=" + rno + ", rtitle=" + rtitle + ", rprice=" + rprice + "]";
	}
}

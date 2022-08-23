package org.comstudy21.myweb.product.model;

public class ProductDTO {
   private int rno; // number(4) primary key,
   private String rtitle; // varchar2(100) not null,
   private int rprice; // number(7)
   
   public ProductDTO() {
      this(0, "", 0);
   }

   public ProductDTO(int rno, String rtitle, int rprice) {
      this.rno = rno;
      this.rtitle = rtitle;
      this.rprice = rprice;
   }

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
      return "ProductDTO [rno=" + rno + ", rtitle=" + rtitle + ", rprice=" + rprice + "]";
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + rno;
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
      ProductDTO other = (ProductDTO) obj;
      if (rno != other.rno)
         return false;
      return true;
   }
   
}
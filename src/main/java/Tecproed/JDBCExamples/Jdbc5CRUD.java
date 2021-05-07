package Tecproed.JDBCExamples;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Jdbc5CRUD {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
String yol = "jdbc:oracle:thin:@localhost:1521/xe"; // yolun bir string e esitledik, kolaylik olsun diye
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		Connection con = DriverManager.getConnection(yol, "hr", "hr");
		
		Statement st = con.createStatement();
		
		/*=======================================================================
				 ORNEK1: urunler adinda bir tablo olusturalim id(NUMBER(3), 
				 isim VARCHAR2(10) fiyat NUMBER(6,2) 
				========================================================================*/
		
		// Cok miktarda kayit eklemek icin PreparedStatement metodu kullanilabilir. 
		// PreparedStatement hem hizli hem de daha guvenli (SQL injection saldirilari icin) bir yontemdir. 
		// Bunun icin; 
		// 	1) Veri girisine uygun bir POJO(Plain Old Java Object) sinifi olusturulur.
		// 	2) POJO Class nesnelerini saklayacak bir collection olusturulur
		// 	3) bir dongu ile kayitlar eklenir.
		// sql de tablo olusturdum, kolay oldu :)
		
//		List<Urun> kayitlar = new ArrayList<>();
//		kayitlar.add(new Urun(101, "laptop", 6500));
//		kayitlar.add(new Urun(102,"PC", 4500));
//		kayitlar.add(new Urun(103,"Telefon", 4500));
//		kayitlar.add(new Urun(104,"Anakart", 1500));
//		kayitlar.add(new Urun(105,"Klavye", 200));
//		kayitlar.add(new Urun(106,"Fare", 100));
//		
//		String insertQuery = "INSERT INTO urunler VALUES(?,?,?)";
//		
//		PreparedStatement pst =con.prepareStatement(insertQuery);
//		
//		for(Urun each: kayitlar) {
//			pst.setInt(1, each.getId());
//			pst.setString(2,each.getIsim());
//			pst.setDouble(3,each.getFiyat());
//			pst.addBatch();
//		}
//		
//		int [] sonuc =pst.executeBatch();
//		System.out.println(sonuc.length +" kayit eklendi");
	
	//	System.out.println(kayitlar);
		
//		String g = "select * from urunler";
//		
//		
//		ResultSet f = st.executeQuery(g);
//		int sayi=1;
//		
//		while(f.next()) {
//			System.out.println(sayi+ "\t"+ f.getInt(1) +"\t"+ f.getString(2)+"\t"+ f.getDouble(3));
//			sayi++;
//		}
		
		
		/*=======================================================================
		  ORNEK3: urunler tablosundaki PC'nin fiyatini %10 zam yapiniz
		========================================================================*/
		

		
//		String updateQuery1 = "UPDATE urunler"
//				  + " SET fiyat = fiyat * 1.1"
//				  + " WHERE isim='PC'";
//
//int s1 = st.executeUpdate(updateQuery1);
//System.out.println(s1 + " satir guncellendi.."); // 2 defa guncellendi
		
		/*=======================================================================
		  ORNEK4: urunler tablosuna 107, Monitor, 1250 sekilnde bir kayit ekleyiniz
		========================================================================*/	
		
		String o4= "INSERT INTO urunler VALUES(107, 'Monitor', 1250)";
		//1.yol
//		boolean  b = st.execute(o4);
//		System.out.println(b + " ekleme basarili");
		//2.yol
//		int i4 = st.executeUpdate(o4);
//		System.out.println(i4 + " satir eklendi");
		
		/*=======================================================================
		  ORNEK5: urunler tablosundaki Klavyeyi siliniz.
		========================================================================*/
		
//		String deleteQuery1 = "DELETE FROM urunler"
//		  		   + " WHERE id=105";
//
//int s3 = st.executeUpdate(deleteQuery1);
//System.out.println(s3 + " satir silindi..");	
		
		/*=======================================================================
		  ORNEK6: urunler tablosuna Marka adinda ve Default degeri ASUS olan yeni 
		  bir sutun ekleyiniz.
		========================================================================*/
		
//		String o6 ="ALTER TABLE urunler"
//				+ " ADD marka VARCHAR(10) DEFAULT 'ASUS'";
//		
//		int i6 = st.executeUpdate(o6);
//		System.out.println(i6 + " sutun eklendi");
		
		/*=======================================================================
		  ORNEK7: urunler tablosundaki kayitlari sorgulayiniz.
		========================================================================*/ 
		
//		String sorgu = " SELECT * FROM urunler";
//		
//	ResultSet s= st.executeQuery(sorgu);
//	int sayi1=1;
//	System.out.println("S.NO"+"\t"+"ID"+"\t"+"ISIM"+"\t"+"FIYAT"+"\t"+"MARKA");
//	System.out.println("=======================================");
//	while(s.next()) {
//		System.out.println(sayi1 +"\t"+ s.getInt(1)+"\t"+ s.getString(2)+"\t"+s.getDouble(3)+"\t"+s.getString(4));
//		sayi1++;
//	}
	
	/*=======================================================================
	  ORNEK8: urunler tablosunu siliniz.
	========================================================================*/ 
	String sil = "DROP TABLE urunler";
	int i8= st.executeUpdate(sil);
	System.out.println(i8 +" silindi");
		
		con.close();
		st.close();
		
	}

}

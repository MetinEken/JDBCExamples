package Tecproed.JDBCExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc1Query01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	//1.// 1) Ilgili driver'i yuklemeliyiz.	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 2) Baglanti olusturmaliyiz.
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "hr", "hr");
		// 3) SQL komutlari icin bir Statement nesnesi olsutur.(obje olusturma)
		Statement st = con.createStatement();
		// 4) SQL ifadeleri yazabilir ve calistirabiliriz.(kod yazma)
		ResultSet isim = st.executeQuery("SELECT personel_isim FROM personel WHERE personel_id=7369");
		// 5) Sonuclari aldik ve isledik.
		while(isim.next()) {
			System.out.println("personel ismi : " + isim.getString("personel_isim"));
		}
		
		String q3 = "SELECT p.personel_isim, b.bolum_isim, p.maas"
				+ " FROM personel p"
				+ " FULL JOIN bolumler b"
				+ " ON b.bolum_id=p.bolum_id"
				+ " ORDER BY p.maas";
		
		
		ResultSet sonuc1 = st.executeQuery(q3);
		
		while(sonuc1.next()) {
			
			System.out.println("Personel Isım: " + sonuc1.getString(1) + "Bolum Isım: " + sonuc1.getString(2) + "Maas" + sonuc1.getInt(3)); 
					
		}
		
		
		// 6) Olusturulan nesneleri bellekten kaldiralim.
		con.close();
		isim.close();
		st.close();
		sonuc1.close();
		
	}

}
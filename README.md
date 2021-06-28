Kahve Sipariş Sistemi<a name="TOP"></a>
===================

# Entity Package #
	
	Bu pakette veri tabanında olabilecek objeler bulunuyor. Coffee objesi içinde id, isim, fiyat ve malzemeler 
	bölümünü barındırıyor. Coffee dışında başka bir 
	object kullanılması durumu olabileceği için Entity interface'i implement edilmiştir. 
# DataAccess Package #
	
	Bu pakette veriye erişim kodlarının olduğu veri tabanıyla haberleşerek işlemleri yerine getiren kodlar bulunmakta. 
	Not: Veritabanı kullanılmadı. Sadece simüle edildi.
# Business Package #
	
	Bu pakette kullanıcının etkileşim kurduğu katman. DataAccess katmanıyla haberleşip verileri çeker ve 
	kullanıcıya yani Console a aktarır. DataAccess de kullanılar kodlara zayıf bağlıdır çünkü ileride 
	başka bir YCoffeeDao eklendiğinde bu katmanın etkilenmemesi için.
# Console Package #
	
	Bu pakette kullanıcının sipariş verdiği paket. Örneğin bir internet sitesinin arayüzü gibi düşünülebilir.
	Business katmanıyla haberleşerek gerekli operasyonları gerçekleştirmeye yarayan kodlar bu katmanda bulunur.

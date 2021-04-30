package oopgiris;

public class Main {

	public static void main(String[] args) {

		/*
		 * Product product1 = new Product();// instance creation; product1.id =1;
		 * product1.name = "Lenovo V24"; product1.unitPrice = 15000; product1.detail =
		 * "16 gb RAM";
		 * 
		 * Product product2 = new Product();// instance creation; product2.id =2;
		 * product2.name = "Lenovo V25"; product2.unitPrice = 12000; product2.detail =
		 * "8 gb RAM";
		 * 
		 * Product product3 = new Product();// instance creation; product3.id =3;
		 * product3.name = "Lenovo V35"; product3.unitPrice = 18000; product3.detail =
		 * "32 gb RAM";
		 * 
		 * Product[] products = {product1,product2,product3};
		 * 
		 * for(Product product: products) {
		 * System.out.println(product.name+" - "+product.unitPrice); }
		 */
		Product product1 = new Product(1, "Lenovo", 15000, "16GB Ram", 10, 13500);
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 GB RAM");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		System.out.println("İndirimli Fiyat: " + product2.getUnitPriceAfterDiscount());
		// System.out.println(product1.name + " - " + product1.unitPrice);
		/*
		 * Category category1 = new Category(); category1.id = 1; category1.name =
		 * "Bilgisayar";
		 * 
		 * Category category2 = new Category(); category2.id = 1; category2.name =
		 * "Telefon"; //System.out.println(category2.name);
		 */
		ProductManager productManager = new ProductManager();

		productManager.addToCart(product1);// ProductManager metodundan,
		// productManager adında bir nesne yarattık. Daha sonra bu nesneden addToChart
		// metodunu çağırdık.

		Category category1 = new Category();
		Category category2 = new Category();
		category1.setId(1);
		category1.setName("Yiyecekler");
		category2.setId(2);
		category2.setName("İçecekler");
		System.out.println(category1.getName());
		System.out.println(category2.getName());

	}

}



class Product {
	String name;
	double price;
	int stock;
	
	Product(String name, double price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	String getName() {
		return name;
	}
	
	double getPrice() {
		return price;
	}
	
	int getStock() {
		return stock;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setPrice(double price) {
		this.price = price;
	}
	
	void setStock(int stock) {
		this.stock = stock;
	}
	
	String showProductInfo() {
		return "Product{" + "name=" + name + ", price=" + price + ", stock=" + stock + '}';
	}
}
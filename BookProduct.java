package products;

public class BookProduct extends Product {
	private String author;
	private String isbn;
	private int pages;
	
	public BookProduct(String id, String name, double price,
            String description, int stockQuantity, String author, String isbn, int pages) {
		super(id, name, price, description, stockQuantity);
		this.author=author;
		this.isbn=isbn;
		this.pages=pages;
		
	}

	@Override
	public double calculateDiscount() {
		// TODO Auto-generated method stub
		return price*0.10;
	}

}

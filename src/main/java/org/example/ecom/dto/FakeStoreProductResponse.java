package org.example.ecom.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FakeStoreProductResponse{
	private String image;
	private Object price;
	private Rating rating;
	private String description;
	private int id;
	private String title;
	private String category;

	public String getImage(){
		return image;
	}

	public Object getPrice(){
		return price;
	}

	public Rating getRating(){
		return rating;
	}

	public String getDescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public String getTitle(){
		return title;
	}

	public String getCategory(){
		return category;
	}
}

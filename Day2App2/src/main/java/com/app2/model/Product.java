package com.app2.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Product {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int	id;


 @NotNull(message = "can not be null")
 @NotEmpty(message = "can not be empty")
@Pattern(regexp="[a-z]*")
private String	name;
@NotNull(message = "price can not be empty")
@Max(value = 10000)
//@DecimalMax(value = "12.55",message = "max value should be 12.55")
private int	price;
@NotNull
@NotEmpty
@Size(max = 10,min = 3,message = "brand must be between 3 to 10 char length")
private String	brand;
private String	category;//(Ex: Electronics, Glossary, clothing)
private int	registration_number;
private int	manufacturer_id;
 
@Past(message = "date should be in past")
@JsonFormat(pattern = "dd-MM-yyyy")
private LocalDate	manufacturring_date;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public int getRegistration_number() {
	return registration_number;
}

public void setRegistration_number(int registration_number) {
	this.registration_number = registration_number;
}

public int getManufacturer_id() {
	return manufacturer_id;
}

public void setManufacturer_id(int manufacturer_id) {
	this.manufacturer_id = manufacturer_id;
}

public LocalDate getManufacturring_date() {
	return manufacturring_date;
}

public void setManufacturring_date(LocalDate manufacturring_date) {
	this.manufacturring_date = manufacturring_date;
}

 

@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand + ", category=" + category
			+ ", registration_number=" + registration_number + ", manufacturer_id=" + manufacturer_id
			+ ", manufacturring_date=" + manufacturring_date + "]";
}




}

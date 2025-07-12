package Day4;

public class Bike 
{
	String brand;
	int id;
	String model;

	//Constructor
	public Bike()
	{
		brand="TVS";
		id=1;
		model="XL";
	}
	
	//Parameterized Constructor
	public Bike(String nBike,int nid,String nmodel)
	{
		this.brand = nBike;
		this.id = nid;
		this.model=nmodel;
	}

	//Getters and Setters for variables
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() 
	{
		return "Bike [brand=" + brand + ", id=" + id + ", model=" + model + "]";
    }
	

}

package webusingsql.model;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class items {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDItem")
	private int IDItem;
	
	@Column(name = "Name", length = 30, nullable = false)
    private String Name;
	
	@Column(name = "Cost", nullable = false)
    private double Cost;

	public items(int iDItem, String Name, double cost) {
		IDItem = iDItem;
		Name = Name;
		Cost = cost;
	}

	public items() {}

	public int getIDItem() {
		return IDItem;
	}

	public void setIDItem(int iDItem) {
		IDItem = iDItem;
	}

	public String getName() {
		return Name;
	}

	public void setName(String itemName) {
		Name = itemName;
	}

	public double getCost() {
		return Cost;
	}

	public void setCost(double cost) {
		Cost = cost;
	}
	
	
	
}

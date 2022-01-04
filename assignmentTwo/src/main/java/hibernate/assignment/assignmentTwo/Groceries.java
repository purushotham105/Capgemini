package hibernate.assignment.assignmentTwo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Groceries {
	@Id
	private String itemName;
	private int itemCost;
	private double itemWeight;
	public Groceries() {
		super();
	}
	public Groceries(String itemName, int itemCost, double itemWeight) {
		super();
		this.itemName = itemName;
		this.itemCost = itemCost;
		this.itemWeight = itemWeight;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemCost() {
		return itemCost;
	}
	public void setItemCost(int itemCost) {
		this.itemCost = itemCost;
	}
	public double getItemWeight() {
		return itemWeight;
	}
	public void setItemWeight(double itemWeight) {
		this.itemWeight = itemWeight;
	}
	@Override
	public String toString() {
		return "Groceries [itemName=" + itemName + ", itemCost=" + itemCost + ", itemWeight=" + itemWeight + "]";
	}
	

}

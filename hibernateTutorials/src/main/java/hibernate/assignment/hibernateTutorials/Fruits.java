package hibernate.assignment.hibernateTutorials;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fruits {
	@Id
  private String fruitName;
  private int cost;
	public Fruits(String fruitName, int cost) {
		super();
		this.fruitName = fruitName;
		this.cost = cost;
	}
	public Fruits() {
		super();
	}
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Fruits [fruitName=" + fruitName + ", cost=" + cost + "]";
	}
  
}

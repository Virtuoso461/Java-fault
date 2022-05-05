package Book81;
import java.util.*;

public class Main{
	
}

abstract class ConcreteBuilder {
	public abstract void BuildParts();
	public abstract Product getResult();
}

class Builder1 extends Builder {
	Product product = new Product();
	
	@Override
	public void BuilderPart() {
		
	}
	
	@Override
	public Product getResult() {
		product.Add(part:"A");
		product.Add(part:"B");
		product.Add(part:"C");
		product.Add(part:"D");
		product.Add(part:"E");
		product.Add(part:"F");
	}
}

class Builder2 extends Builder {
	Product product = new Product();
	
	@Override
	public void BuilderPart() {
		
	}
	
	@Override
	public Product getResult() {
		product.Add(part:"A");
		product.Add(part:"B");
		product.Add(part:"C");
		product.Add(part:"D");
		product.Add(part:"E");
		product.Add(part:"F");
	

public class Product {
	List<String> parts = new ArrayList<String>();
	
	public void Add(String part) {
		parts.add(part);
	}
	
	public void show() {
		System.out.print("产品的组成：");
		for(String s:parts) {
			System.out.print(s+" ");
		}
		System.out.print("\n");
	}
}


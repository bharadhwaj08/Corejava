package com.siiet.Streamapi;

import java.util.ArrayList;
import java.util.List;

public class Javastreamclass {
public static void main(String[] args) {
	List<Product> pl=new ArrayList<Product>();
	pl.add(new Product(1,"hp",400000));
	pl.add(new Product(2,"dell",500000));
	pl.add(new Product(3,"apple",600000));
	List<Float>pl2=pl.stream().filter(p->p.price<30000);
	
	
}
}

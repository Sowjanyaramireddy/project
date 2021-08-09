package com.example.demo1.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.Model.Product;
import com.example.demo1.Repository.ProductRepository;

@RestController
@RequestMapping("products")
public class ProductController {

	@Autowired
	private ProductRepository repo;
	
	//to get all the products
	@GetMapping("all")
	public List<Product> getAllProducts()
	{
		return (List<Product>) repo.findAll();
	}
	
	//to create the product
	@PostMapping("create")
	public Product addProduct(@RequestBody Product prod)
	{
		return repo.save(prod);
		
	}
	//to get the product by id
	@GetMapping("product/{id}")
	public Product getProductId(@PathVariable int id) throws Exception
	{
	    Optional<Product> h= repo.findById(id);
	    if(!h.isPresent())
	    	throw new Exception("Please enter Correct Product id");
		return h.get();
	    
	}
	//to edit the product
	@PutMapping("edit/{id}")
	public Product updateProduct(@RequestBody Product prod)
	{
		return repo.save(prod);
	}
	
	//to delete the product by id
	@DeleteMapping("delete/{id}")
	public void deleteProduct(@PathVariable int id)
	{
	    repo.deleteById(id);
	}
}

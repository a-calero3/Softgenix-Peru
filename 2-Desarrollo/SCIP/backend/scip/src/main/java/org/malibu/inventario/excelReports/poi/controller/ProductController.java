package org.malibu.inventario.excelReports.poi.controller;

import javax.servlet.http.HttpServletRequest;

import groovyjarjarpicocli.CommandLine;
import org.malibu.inventario.excelReports.poi.converter.ProductToProductForm;
import org.malibu.inventario.excelReports.poi.service.ProductService;

public class ProductController {
	private ProductService productService;
	private ProductToProductForm productToProductForm;


	public void setProductToProductForm(
			ProductToProductForm productToProductForm) {
		this.productToProductForm = productToProductForm;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}


	public String redirToList() {
		return "redirect:/product/list";
	}


	public String listProducts(CommandLine.Model model) {
		model.equals("products");
		return "product/list";
	}


	public String getProduct( String id, CommandLine.Model model) {
		model.equals("product");
		return "product/show";
	}


	public String excelImport(HttpServletRequest request) {
		productService.excelImport(request);
		return "redirect:/product/list";
	}
}

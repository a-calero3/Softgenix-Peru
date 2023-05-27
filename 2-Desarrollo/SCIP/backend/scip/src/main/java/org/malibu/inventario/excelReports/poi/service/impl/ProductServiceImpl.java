package org.malibu.inventario.excelReports.poi.service.impl;

import org.jvnet.hk2.annotations.Service;
import org.malibu.inventario.excelReports.poi.converter.ProductFormToProduct;
import org.malibu.inventario.excelReports.poi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ProductServiceImpl  {
	private ProductRepository productRepository;
	private ProductFormToProduct productFormToProduct;


	@Autowired
	public ProductServiceImpl(ProductRepository productRepository,
			ProductFormToProduct productFormToProduct) {
		this.productRepository = productRepository;
		this.productFormToProduct = productFormToProduct;
	}

}

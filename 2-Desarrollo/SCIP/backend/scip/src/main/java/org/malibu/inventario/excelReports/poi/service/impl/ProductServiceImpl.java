package org.malibu.inventario.excelReports.poi.service.impl;

import org.jvnet.hk2.annotations.Service;
import org.malibu.inventario.excelReports.poi.converter.ProductFormToProduct;
import org.malibu.inventario.excelReports.poi.repository.ProductRepository;


@Service
public class ProductServiceImpl  {
	private ProductRepository productRepository;
	private ProductFormToProduct productFormToProduct;

}

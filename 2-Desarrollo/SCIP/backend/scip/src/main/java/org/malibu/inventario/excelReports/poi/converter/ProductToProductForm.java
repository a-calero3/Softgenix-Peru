package org.malibu.inventario.excelReports.poi.converter;

import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.malibu.inventario.excelReports.poi.command.ProductForm;
import org.springframework.core.convert.converter.Converter;

import org.malibu.inventario.excelReports.poi.modelos.Producto;


public class ProductToProductForm implements Converter<Producto, ProductForm> {


	@Override
	public ProductForm convert(Producto source) {
		return null;
	}

	@Override
	public <U> Converter<Producto, U> andThen(Converter<? super ProductForm, ? extends U> after) {
		return Converter.super.andThen(after);
	}
}

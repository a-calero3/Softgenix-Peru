package org.malibu.inventario.excelReports.poi.converter;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.malibu.inventario.excelReports.poi.command.ProductForm;

import org.malibu.inventario.excelReports.poi.modelos.*;


public class ProductFormToProduct implements Converter<ProductForm, Producto> {

	@Override
	public Producto convert(ProductForm value) {
		return null;
	}

	@Override
	public JavaType getInputType(TypeFactory typeFactory) {
		return null;
	}

	@Override
	public JavaType getOutputType(TypeFactory typeFactory) {
		return null;
	}
}

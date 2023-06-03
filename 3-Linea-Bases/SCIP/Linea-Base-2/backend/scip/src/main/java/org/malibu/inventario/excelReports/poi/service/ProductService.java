package org.malibu.inventario.excelReports.poi.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.malibu.inventario.excelReports.poi.modelos.Categoria;

public interface ProductService {
	List<Categoria> listAll();

	Categoria getById(Long id);

	Categoria saveOrUpdate(Categoria categoria);

	void delete(Long id);

    List<Categoria> export(HttpServletResponse response);

	List excelImport(HttpServletRequest request);
}


package org.malibu.inventario.excelReports.poi.repository;

import org.malibu.inventario.excelReports.poi.modelos.Categoria;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Categoria, Long> {
}

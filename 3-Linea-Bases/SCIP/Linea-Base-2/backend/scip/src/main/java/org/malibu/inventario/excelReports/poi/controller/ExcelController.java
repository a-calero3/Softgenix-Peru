

package org.malibu.inventario.excelReports.poi.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import jdk.internal.loader.Resource;
import org.malibu.inventario.excelReports.poi.service.ExcelService;
import org.malibu.inventario.excelReports.poi.util.Globals;


public class ExcelController {

	private ExcelService excelService;
	private HttpServletResponse response;


	public List read(String fileName) throws IOException {
		Resource resource = null;
		InputStream is = resource.getInputStream();
		List<List<Object>> list = excelService.readExcel(is,
				Globals.SUFFIX_XLS);
		return list;
	}

	public String export(String fileName) throws IOException {
		String docsPath = excelService.export2003(fileName, response);
		return docsPath;
	}

}

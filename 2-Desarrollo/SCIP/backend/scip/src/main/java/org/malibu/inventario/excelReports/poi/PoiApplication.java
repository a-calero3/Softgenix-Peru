
package org.malibu.inventario.excelReports.poi;



import org.malibu.inventario.excelReports.poi.util.Globals;

import java.io.File;


public class PoiApplication  {
	public static void main(String[] args) {
		File file = new File(Globals.DOC_PATH);
		if (!file.exists()) {
			file.mkdirs();
		}
	}
}
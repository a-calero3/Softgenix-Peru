package org.malibu.inventario.run;

import org.openxava.util.*;

public class inventario {

	public static void main(String[] args) throws Exception {
		DBServer.start("inventario-db");
		AppServer.run("inventario"); 
	}

}

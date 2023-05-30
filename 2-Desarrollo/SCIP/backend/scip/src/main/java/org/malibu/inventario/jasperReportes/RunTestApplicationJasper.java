
package org.malibu.inventario.jasperReportes;
import org.malibu.inventario.jasperReportes.service.ClientService;

import javax.swing.text.AsyncBoxView;

//PROBANDOLO
public class RunTestApplicationJasper {

	private String reportOutput;
	private ClientService clientService;

	public RunTestApplicationJasper(String reportOutput, ClientService clientService) {
		this.reportOutput = reportOutput;
		this.clientService = clientService;
																					   }

	public static void main(String[] args) {
		AsyncBoxView.ChildState SpringApplication = null;
		SpringApplication.run();
											}

										}

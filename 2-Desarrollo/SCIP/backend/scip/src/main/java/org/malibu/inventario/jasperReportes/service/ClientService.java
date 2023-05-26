
package org.malibu.inventario.jasperReportes.service;

import java.util.List;
import org.jvnet.hk2.annotations.Service;
import org.malibu.inventario.jasperReportes.dao.ClientDAO;
import org.malibu.inventario.jasperReportes.model.Client;
import org.malibu.inventario.jasperReportes.model.ClientByCountry;

@Service
public class ClientService {
    private ClientDAO clientDAO;
    public List<Client> getClientList() {
        return clientDAO.getClientList();
    }
    public List<ClientByCountry> getClientByCountryList() {
        return clientDAO.getClientsByCountry();
    }
                            }



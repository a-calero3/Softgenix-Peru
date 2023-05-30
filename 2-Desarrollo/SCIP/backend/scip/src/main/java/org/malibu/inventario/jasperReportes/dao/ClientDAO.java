
package org.malibu.inventario.jasperReportes.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jvnet.hk2.annotations.Service;
import org.malibu.inventario.jasperReportes.model.Client;
import org.malibu.inventario.jasperReportes.model.ClientByCountry;


@Service
public class ClientDAO {

    public List<Client> getClientList() {
        List<Client> clientList = new ArrayList<>();

        String sql = "SELECT * FROM Clients ORDER BY name;";
        Object jdbc = new Object();

        List<Map<String, Object>> rows = null;
        for (Map<String, Object> row : rows) {
            Client client = new Client((int)row.get("ID"), (String)row.get("NAME"), (String)row.get("COUNTRY"));
            clientList.add(client);
                                             }
        return clientList;
    }

    public List<ClientByCountry> getClientsByCountry() {
        List<ClientByCountry> clientByCountryList = new ArrayList<>();

        String sql = "SELECT COUNT(*) as TOTAL, country from Clients GROUP BY country order by TOTAL DESC;";
        List<Map<String, Object>> rows = null;
        for (Map<String, Object> row : rows) {
            ClientByCountry clientByCountry = new ClientByCountry((String)row.get("COUNTRY"), (int)row.get("TOTAL"));
            clientByCountryList.add(clientByCountry);
                                             }
        return clientByCountryList;
                                                      }
                    }
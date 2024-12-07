package com.prestabanco.mstracking.services;

import com.prestabanco.mstracking.clients.ClientsFeignClient;
import com.prestabanco.mstracking.clients.CreditRequestFeignClient;
import com.prestabanco.mstracking.entities.ClientEntity;
import com.prestabanco.mstracking.entities.CreditRequestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RequestTrackingService {

    @Autowired
    private ClientsFeignClient clientsFeignClient;

    @Autowired
    private CreditRequestFeignClient creditRequestFeignClient;


    /**
     * statusRequestClient method to get the status of a request
     * @param rut
     * @return the status of the request
     */
    public List<String> statusRequestClient(String rut) {
        Optional<ClientEntity> clientOpt = Optional.ofNullable(clientsFeignClient.findClientByrut(rut));
        if (clientOpt.isPresent()) {
            ClientEntity client = clientOpt.get();
            String listRequestId = client.getListRequestId();
            if (listRequestId == null || listRequestId.isEmpty()) {
                return new ArrayList<>(); // Return an empty list if listRequestId is null or empty
            }
            String[] listRequestIdArray = listRequestId.split("-");
            List<String> statusList = new ArrayList<>();

            for (String id : listRequestIdArray) {
                Optional<CreditRequestEntity> creditRequest = Optional.ofNullable(creditRequestFeignClient.findRequestById(Long.parseLong(id)));
                creditRequest.ifPresent(creditRequestEntity -> statusList.add(creditRequestEntity.getStateRequest()));
                creditRequest.ifPresent(creditRequestEntity -> statusList.add(creditRequestEntity.getId().toString()));
            }

            return statusList;
        } else {
            return null;
        }
    }
}

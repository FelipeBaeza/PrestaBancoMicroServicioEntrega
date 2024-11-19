package com.example.ms_requestTracking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CreditRequestService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private CreditRequestRepository creditRequestRepository;


    /**
     * statusRequestClient method to get the status of a request
     * @param rut
     * @return the status of the request
     */
    public List<String> statusRequestClient(String rut) {
        Optional<ClientEntity> clientOpt = clientRepository.findByRut(rut);
        if (clientOpt.isPresent()) {
            ClientEntity client = clientOpt.get();
            String listRequestId = client.getListRequestId();
            if (listRequestId == null || listRequestId.isEmpty()) {
                return new ArrayList<>(); // Return an empty list if listRequestId is null or empty
            }
            String[] listRequestIdArray = listRequestId.split("-");
            List<String> statusList = new ArrayList<>();

            for (String id : listRequestIdArray) {
                Optional<CreditRequestEntity> creditRequest = creditRequestRepository.findById(Long.parseLong(id));
                creditRequest.ifPresent(creditRequestEntity -> statusList.add(creditRequestEntity.getStateRequest()));
                creditRequest.ifPresent(creditRequestEntity -> statusList.add(creditRequestEntity.getId().toString()));
            }

            return statusList;
        } else {
            return null;
        }
    }
}

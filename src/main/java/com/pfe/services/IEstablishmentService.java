package com.pfe.services;

import com.pfe.models.Establishment;

public interface IEstablishmentService {
    Establishment createCompany(Establishment establishment);
    Establishment login(Establishment establishment);
    Establishment findEstablishment(long id);
}

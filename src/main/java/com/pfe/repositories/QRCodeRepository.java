package com.pfe.repositories;

import com.pfe.models.Qrcode;
import org.springframework.data.repository.CrudRepository;

public interface QRCodeRepository extends CrudRepository<Qrcode, Long> {
}

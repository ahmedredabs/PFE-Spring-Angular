package com.pfe.services;

import com.pfe.models.QRCode;
import com.pfe.repositories.QRCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QRCodeService implements IQRCodeService {

    @Autowired
    private QRCodeRepository qrCodeRepository;

    @Override
    public QRCode createQRCode(QRCode newQRCode) {
        return qrCodeRepository.save(newQRCode);
    }
}

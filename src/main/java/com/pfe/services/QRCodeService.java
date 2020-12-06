package com.pfe.services;

import com.pfe.models.Qrcode;
import com.pfe.repositories.QRCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QRCodeService implements IQRCodeService {

    @Autowired
    private QRCodeRepository qrCodeRepository;

    @Override
    public Qrcode createQRCode(Qrcode newQRCode) {
        return qrCodeRepository.save(newQRCode);
    }
}

package com.pfe.services;

import com.pfe.models.Scan;

public interface IScanService {
    Scan createVisitScan(Scan scan);
    Scan createAlertScan(Scan scan);
}

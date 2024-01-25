package org.eclipse.uprotocol.service.androidproxy.vehicleservice;

import com.google.protobuf.Descriptors;

import org.covesa.uservice.vehicle.body.cabin_climate.v1.CabinClimateService;
import org.eclipse.uprotocol.service.androidproxy.BaseService;
import org.eclipse.uprotocol.service.androidproxy.utils.Constants;

public class CabinClimate extends BaseService {
    Descriptors.ServiceDescriptor serviceDescriptor = CabinClimateService.getDescriptor().findServiceByName("BodyCabinclimate");

    @Override
    public void onCreate() {
        super.onCreate();
        Constants.ENTITY_SERVICE_MAP.put(serviceDescriptor.getName(), CabinClimate.class);
        initializeULink(serviceDescriptor);
    }

}

/*
 * Copyright (C) GM Global Technology Operations LLC 2021.
 * All Rights Reserved.
 * GM Confidential Restricted.
 */

package org.eclipse.uprotocol.service.androidproxy;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import org.eclipse.uprotocol.service.androidproxy.utils.Constants;
import org.eclipse.uprotocol.service.androidproxy.vehicleservice.BodyMirrors;
import org.eclipse.uprotocol.service.androidproxy.vehicleservice.Braking;
import org.eclipse.uprotocol.service.androidproxy.vehicleservice.CabinClimate;
import org.eclipse.uprotocol.service.androidproxy.vehicleservice.Chassis;
import org.eclipse.uprotocol.service.androidproxy.vehicleservice.Engine;
import org.eclipse.uprotocol.service.androidproxy.vehicleservice.Exterior;
import org.eclipse.uprotocol.service.androidproxy.vehicleservice.HelloWorld;
import org.eclipse.uprotocol.service.androidproxy.vehicleservice.Horn;
import org.eclipse.uprotocol.service.androidproxy.vehicleservice.Suspension;
import org.eclipse.uprotocol.service.androidproxy.vehicleservice.Transmission;
import org.eclipse.uprotocol.service.androidproxy.vehicleservice.Vehicle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Start the SocketServerService when the activity is created
        startService(new Intent(this, AndroidProxyService.class));
        //vehicle service will start only when there is request from host
        Constants.ENTITY_SERVICE_MAP.put("body.cabin_climate", CabinClimate.class);
        Constants.ENTITY_SERVICE_MAP.put("body.mirrors", BodyMirrors.class);
        Constants.ENTITY_SERVICE_MAP.put("chassis.braking", Braking.class);
        Constants.ENTITY_SERVICE_MAP.put("chassis", Chassis.class);
        Constants.ENTITY_SERVICE_MAP.put("propulsion.engine", Engine.class);
        Constants.ENTITY_SERVICE_MAP.put("vehicle.exterior", Exterior.class);
        Constants.ENTITY_SERVICE_MAP.put("example.hello_world", HelloWorld.class);
        Constants.ENTITY_SERVICE_MAP.put("body.horn", Horn.class);
        Constants.ENTITY_SERVICE_MAP.put("chassis.suspension", Suspension.class);
        Constants.ENTITY_SERVICE_MAP.put("propulsion.transmission", Transmission.class);
        Constants.ENTITY_SERVICE_MAP.put("vehicle", Vehicle.class);


    }
}
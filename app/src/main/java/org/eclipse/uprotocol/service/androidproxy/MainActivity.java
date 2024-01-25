/*
 * Copyright (C) GM Global Technology Operations LLC 2021.
 * All Rights Reserved.
 * GM Confidential Restricted.
 */

package org.eclipse.uprotocol.service.androidproxy;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

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
        startService(new Intent(this, BodyMirrors.class));
        startService(new Intent(this, Braking.class));
        startService(new Intent(this, CabinClimate.class));
        startService(new Intent(this, Chassis.class));
        startService(new Intent(this, Engine.class));
        startService(new Intent(this, Exterior.class));
        startService(new Intent(this, HelloWorld.class));
        startService(new Intent(this, Horn.class));
        startService(new Intent(this, Suspension.class));
        startService(new Intent(this, Transmission.class));
        startService(new Intent(this, Vehicle.class));

    }
}
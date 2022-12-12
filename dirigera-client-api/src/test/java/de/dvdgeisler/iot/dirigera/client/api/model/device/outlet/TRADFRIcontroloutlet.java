package de.dvdgeisler.iot.dirigera.client.api.model.device.outlet;

import de.dvdgeisler.iot.dirigera.client.api.http.rest.json.device.Device;
import de.dvdgeisler.iot.dirigera.client.api.http.rest.json.device.outlet.OutletDevice;
import de.dvdgeisler.iot.dirigera.client.api.model.device.DeviceTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TRADFRIcontroloutlet extends DeviceTest {
    final static String JSON = """
            {
              "id" : "6379a590-dc0a-47b5-b35b-7b46dfefd282_1",
              "type" : "outlet",
              "deviceType" : "outlet",
              "createdAt" : "2022-11-11T17:05:54.000Z",
              "isReachable" : true,
              "lastSeen" : "2022-11-11T17:06:02.000Z",
              "attributes" : {
                "customName" : "Uttag 1",
                "firmwareVersion" : "2.3.089",
                "hardwareVersion" : "1",
                "manufacturer" : "IKEA of Sweden",
                "model" : "TRADFRI control outlet",
                "productCode" : "E1603",
                "serialNumber" : "D0CF5EFFFEEF2B3F",
                "isOn" : true,
                "startupOnOff" : "startPrevious",
                "lightLevel" : 100,
                "identifyPeriod" : 0,
                "identifyStarted" : "2000-01-01T00:00:00.000Z",
                "permittingJoin" : false,
                "otaPolicy" : "autoUpdate",
                "otaProgress" : 0,
                "otaScheduleEnd" : "00:00",
                "otaScheduleStart" : "00:00",
                "otaState" : "readyToCheck",
                "otaStatus" : "upToDate"
              },
              "capabilities" : {
                "canSend" : [ ],
                "canReceive" : [ "customName", "isOn", "lightLevel" ]
              },
              "room" : {
                "id" : "decd27b3-f54a-4211-9a8f-e7bf70f832eb",
                "name" : "A",
                "color" : "ikea_green_no_65",
                "icon" : "rooms_arm_chair"
              },
              "deviceSet" : [ ],
              "remoteLinks" : [ ],
              "isHidden" : false
            }
            """;

    public TRADFRIcontroloutlet() {
        super(JSON);
    }

    @Override
    public void validateDeserialize(final Device<?,?> device) {
        assertTrue(device instanceof OutletDevice);
    }
}
package de.dvdgeisler.iot.dirigera.client.api.model.device.shortcutcontroller;

import de.dvdgeisler.iot.dirigera.client.api.http.rest.json.device.Device;
import de.dvdgeisler.iot.dirigera.client.api.http.rest.json.device.shortcutcontroller.ShortcutControllerDevice;
import de.dvdgeisler.iot.dirigera.client.api.model.device.DeviceTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TRADFRISHORTCUTButton extends DeviceTest {
    final static String JSON = """
            {
              "id" : "92dbcea1-3d7e-4d6a-a009-bdf3a1ae6691_1",
              "type" : "controller",
              "deviceType" : "shortcutController",
              "createdAt" : "2022-11-11T16:46:15.000Z",
              "isReachable" : true,
              "lastSeen" : "2022-11-11T16:47:24.000Z",
              "attributes" : {
                "customName" : "Fjärrkontroll 1",
                "firmwareVersion" : "2.3.015",
                "hardwareVersion" : "1",
                "manufacturer" : "IKEA of Sweden",
                "model" : "TRADFRI SHORTCUT Button",
                "productCode" : "E1812",
                "serialNumber" : "84BA20FFFEAD3E56",
                "batteryPercentage" : 100,
                "isOn" : false,
                "lightLevel" : 1,
                "permittingJoin" : false,
                "otaPolicy" : "autoUpdate",
                "otaProgress" : 0,
                "otaScheduleEnd" : "00:00",
                "otaScheduleStart" : "00:00",
                "otaState" : "readyToCheck",
                "otaStatus" : "upToDate"
              },
              "capabilities" : {
                "canSend" : [ "isOn", "lightLevel", "blindsState" ],
                "canReceive" : [ "customName" ]
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

    public TRADFRISHORTCUTButton() {
        super(JSON);
    }

    @Override
    public void validateDeserialize(final Device<?,?> device) {
        assertTrue(device instanceof ShortcutControllerDevice);
    }
}
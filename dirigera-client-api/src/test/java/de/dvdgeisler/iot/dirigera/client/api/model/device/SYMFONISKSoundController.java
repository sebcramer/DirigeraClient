package de.dvdgeisler.iot.dirigera.client.api.model.device;

import de.dvdgeisler.iot.dirigera.client.api.model.device.soundcontroller.SoundControllerDevice;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SYMFONISKSoundController extends DeviceTest {
    final static String JSON = """
            {
              "id" : "cec4c170-7846-4e22-b681-d8a912181cca_1",
              "type" : "controller",
              "deviceType" : "soundController",
              "createdAt" : "2022-11-08T02:11:49.000Z",
              "isReachable" : true,
              "lastSeen" : "2022-11-09T17:53:12.000Z",
              "attributes" : {
                "customName" : "Remote 2",
                "model" : "SYMFONISK Sound Controller",
                "manufacturer" : "IKEA of Sweden",
                "firmwareVersion" : "24.4.5",
                "hardwareVersion" : "1",
                "serialNumber" : "943469FFFE636247",
                "productCode" : "E1744",
                "batteryPercentage" : 90,
                "isOn" : false,
                "lightLevel" : 1,
                "permittingJoin" : false,
                "otaStatus" : "upToDate",
                "otaState" : "readyToCheck",
                "otaProgress" : 0,
                "otaPolicy" : "autoUpdate",
                "otaScheduleStart" : "00:00",
                "otaScheduleEnd" : "00:00"
              },
              "capabilities" : {
                "canSend" : [ "isOn", "lightLevel" ],
                "canReceive" : [ "customName" ]
              },
              "room" : {
                "id" : "297071f0-e98a-4ba0-8c05-9b88a1dbc6c4",
                "name" : "Living Room ",
                "color" : "ikea_green_no_65",
                "icon" : "rooms_arm_chair"
              },
              "deviceSet" : [ ],
              "remoteLinks" : [ ],
              "isHidden" : false
            }
            """;

    public SYMFONISKSoundController() {
        super(JSON);
    }

    @Override
    public void validateDeserialize(final Device<?> device) {
        assertTrue(device instanceof SoundControllerDevice);
    }
}
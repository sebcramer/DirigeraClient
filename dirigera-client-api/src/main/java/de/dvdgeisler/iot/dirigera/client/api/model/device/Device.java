package de.dvdgeisler.iot.dirigera.client.api.model.device;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import de.dvdgeisler.iot.dirigera.client.api.model.Identifier;
import de.dvdgeisler.iot.dirigera.client.api.model.device.gateway.GatewayDevice;
import de.dvdgeisler.iot.dirigera.client.api.model.device.light.LightDevice;
import de.dvdgeisler.iot.dirigera.client.api.model.device.lightcontroller.LightControllerDevice;
import de.dvdgeisler.iot.dirigera.client.api.model.device.motionsensor.MotionSensorDevice;
import de.dvdgeisler.iot.dirigera.client.api.model.device.outlet.OutletDevice;
import de.dvdgeisler.iot.dirigera.client.api.model.device.repeater.RepeaterDevice;
import de.dvdgeisler.iot.dirigera.client.api.model.device.shortcutcontroller.ShortcutControllerDevice;
import de.dvdgeisler.iot.dirigera.client.api.model.device.soundcontroller.SoundControllerDevice;
import de.dvdgeisler.iot.dirigera.client.api.model.deviceset.DeviceSet;

import java.time.LocalDateTime;
import java.util.List;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "deviceType", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = GatewayDevice.class, name = "gateway"),
        @JsonSubTypes.Type(value = LightDevice.class, name = "light"),
        @JsonSubTypes.Type(value = LightControllerDevice.class, name = "lightController"),
        @JsonSubTypes.Type(value = SoundControllerDevice.class, name = "soundController"),
        @JsonSubTypes.Type(value = MotionSensorDevice.class, name = "motionSensor"),
        @JsonSubTypes.Type(value = OutletDevice.class, name = "outlet"),
        @JsonSubTypes.Type(value = ShortcutControllerDevice.class, name = "shortcutController"),
        @JsonSubTypes.Type(value = RepeaterDevice.class, name = "repeater"),
})
public class Device<_Attributes extends DeviceAttributes, _Configuration extends DeviceConfigurationAttributes> extends Identifier {
    public DeviceCategory type;
    public DeviceType deviceType;
    public LocalDateTime createdAt;
    public Boolean isReachable;
    public LocalDateTime lastSeen;
    public _Attributes attributes;
    public DeviceCapabilities capabilities;
    public List<DeviceSet> deviceSet;
    public List<String> remoteLinks;

    @JsonUnwrapped
    public _Configuration configuration;

    public Device() {
    }

    public Device(
            final String id,
            final DeviceCategory type,
            final DeviceType deviceType,
            final LocalDateTime createdAt,
            final Boolean isReachable,
            final LocalDateTime lastSeen,
            final _Attributes attributes,
            final DeviceCapabilities capabilities,
            final List<DeviceSet> deviceSet,
            final List<String> remoteLinks,
            final _Configuration configuration) {
        super(id);
        this.type = type;
        this.deviceType = deviceType;
        this.createdAt = createdAt;
        this.isReachable = isReachable;
        this.lastSeen = lastSeen;
        this.attributes = attributes;
        this.capabilities = capabilities;
        this.deviceSet = deviceSet;
        this.remoteLinks = remoteLinks;
        this.configuration = configuration;
    }
}

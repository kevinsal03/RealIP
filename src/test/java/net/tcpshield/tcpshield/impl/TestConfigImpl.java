package net.tcpshield.tcpshield.impl;

import net.tcpshield.tcpshield.abstraction.TCPShieldConfig;

import java.util.ArrayList;

public class TestConfigImpl extends TCPShieldConfig {

    public TestConfigImpl(String timestampValidationMode) {

        this.ipWhitelist = new ArrayList<>();

        this.timestampValidationMode = timestampValidationMode;
        this.debug = true;
        this.onlyProxy = true;
        this.ipWhitelist.add("127.0.0.1");
    }
}

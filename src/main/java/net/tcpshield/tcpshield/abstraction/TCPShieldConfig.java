package net.tcpshield.tcpshield.abstraction;

import java.util.List;

public abstract class TCPShieldConfig {

    protected boolean onlyProxy;
    protected String timestampValidationMode;
    protected boolean debug;
    protected List<String> ipWhitelist;

    public boolean isOnlyProxy() {
        return this.onlyProxy;
    }

    public String getTimestampValidationMode() {
        return this.timestampValidationMode;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public List<String> getIPWhitelist() { return this.ipWhitelist; }

}

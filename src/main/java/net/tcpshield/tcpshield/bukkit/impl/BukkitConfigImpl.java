package net.tcpshield.tcpshield.bukkit.impl;

import net.tcpshield.tcpshield.abstraction.TCPShieldConfig;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class BukkitConfigImpl extends TCPShieldConfig {

    public BukkitConfigImpl(JavaPlugin javaPlugin) {
        javaPlugin.saveDefaultConfig();

        FileConfiguration config = javaPlugin.getConfig();

        this.onlyProxy = config.getBoolean("only-allow-proxy-connections");
        this.timestampValidationMode = config.getString("timestamp-validation");
        this.debug = config.getBoolean("debug-mode");
        this.ipWhitelist = config.getStringList("ip-whitelist");
    }
}

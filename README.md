## You probably shouldn't use this! 
I made this because I needed it ASAP and it is probably quite poor code quality and the tests do not cover the modifications. 
This adds an IP Whitelist to allow certain users to connect directly to the proxy. I made only to let [Geyser](https://geysermc.org/) work while also using TCPShield.   
I plan to fix it up and make it proper in the future, and possibly even PR it to main, but until then using this is **NOT RECOMMENDED**!

# TCPShield
TCPShield is the plugin for the same named DDoS mitigation service [TCPShield](https://tcpshield.com).

This plugin is responsible for validating clients join via the TCPShield network.
It also parses passed IP addresses so the server is aware of the real player IP address.  

### Compatibility

TCPShield is compatible with Spigot / CraftBukkit, BungeeCord and Velocity.

When using Spigot / CraftBukkit, [ProtocolLib](https://github.com/aadnk/ProtocolLib) needs to be installed.

### Setup
Setting up the plugin is easy as cake. Please follow [these](https://docs.tcpshield.com/onboarding/tcpshield-plugin) guidelines. 

### Compiling
In order to compile TCPShield, [install Gradle](https://docs.gradle.org/current/userguide/installation.html) and run the following command in the project folder:
```
gradle build
```

The dependencies should install themselves automatically. After the build has finished, the compiled jar file can be found under `/build/libs`.

### Support
See [Contact](https://docs.tcpshield.com/about-us)

### Contributors

These wonderful contributors have helped TCPShield make this plugin better! 

* [Fuzzlemann](https://github.com/Fuzzlemann)
* [RyanDeLap](https://github.com/RyanDeLap)

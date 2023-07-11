# Intro

a fucking simple configuration library for Java / Scala / ...


```java
Konfig config = new Konfig();
String name = config.get("name");
int version = Integer.parseInt(config.get("version"));

// ...
```

env_var and system properties are also supported with priority as: 

1. env vars
2. system properties
3. properties configuration file



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
    - e.g. `export SERVER_PORT=9999; java -jar xxx.jar`
2. system properties
    - e.g. `java -jar -Dserver.port=9999 xxx.jar`， 注意： -D参数的位置**必须**在`-jar`和具体的jar参数之间！！！否则不生效！
3. properties configuration file



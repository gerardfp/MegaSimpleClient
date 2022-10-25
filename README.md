## install

Add to `build.gradle`
``` groovy
repositories {
    // ...
    maven { url "https://jitpack.io" }
}

dependencies {
    // ...
    implementation 'com.github.gerardfp:megasimpleclient:1.1'
}
```

## use
```java
 String response = MegaSimpleClient.fetch("http://localhost:8001");
```
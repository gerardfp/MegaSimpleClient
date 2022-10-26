## install

Add to `build.gradle`
``` groovy
repositories {
    // ...
    maven { url "https://jitpack.io" }
}

dependencies {
    // ...
    implementation 'com.github.gerardfp:mega-simple-client:1.0'
}
```

## use
```java
 String response = MegaSimpleClient.fetch("http://localhost:8001");
```

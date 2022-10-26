## install

Add to `build.gradle`
``` groovy
repositories {
    // ...
    maven { url "https://jitpack.io" }
}

dependencies {
    // ...
    implementation 'com.github.gerardfp:nano-client:1.0'
}
```

## use
```java
 String response = NanoClient.fetch("http://localhost:8001");
```

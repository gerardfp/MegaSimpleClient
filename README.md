## install

(Requires Java 11) 

Add to `build.gradle`
``` groovy
repositories {
    // ...
    maven { url "https://jitpack.io" }
}

dependencies {
    // ...
    implementation 'com.github.gerardfp:nano-client:0.1'
}
```

## use
```java
 String response = NanoClient.fetch("http://localhost:8001");
```

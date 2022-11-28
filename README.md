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
import com.github.gerardfp.NanoClient;

public class Main {
    public static void main(String[] args) {
        String response = NanoClient.fetch("http://localhost:8001");
        
        System.out.println(response);
    }
}
```

This repository contains the [cXML 1.2.024](http://cxml.org/) spec in an Object form to faciliate integration with any kind of cXML purposes (PunchOut, Purchase Order, etc).

Complete details about the package and it's classes can be found in the [Javadoc](docs).

---

# Include as a Maven Dependency

Add the following in your `pom.xml` so that your project is aware of [our artifact repository](https://opensource.sarvika.com/maven-repo/).

```xml
<repositories>
    <repository>
        <id>sarvika-maven-repo</id>
        <url>https://raw.githubusercontent.com/sarvika/maven-repo/master</url>
        <releases>
            <enabled>true</enabled>
        </releases>
        <snapshots>
            <enabled>true</enabled>
        </snapshots>
    </repository>
</repositories>
```

Then you can add the following dependency

```xml
<dependency>
    <groupId>io.sarvika.opensource</groupId>
    <artifactId>cxml-jaxb-model</artifactId>
    <version>1.0</version>
</dependency>
```

---

Please use the [issues board](https://github.com/sarvika/cxml-jaxb-model/issues) for any kind of feature requests and bug reports.

---

This project is maintained by the [Sarvika Opensource](https://opensource.sarvika.com) Team.

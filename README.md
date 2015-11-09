# Exit Sign
[![][travis img]][travis]
[![][mavenbadge img]][mavenbadge]
[![][license img]][license]

Exit Sign is a utility library for handy usage of exit statuses in Java software.

## Table of Contents

* [Installation](#installation)
* [Usage](#usage)
* [Documentation](#documentation)
* [Continuous Integration](#continuous-integration)
* [Source Code Style](#source-code-style)
* [Related Resources](#related-resources)
* [Copyright and License](#copyright-and-license)

## Installation

The latest release version can be found at [GitHub Releases](https://github.com/antonvorobyev/exitsign/releases) 
or at [Maven repository](http://repo1.maven.org/maven2/co/vorobyev/exitsign/).
 
Each-commit builds or maven artifacts can be found at [Maven Snapshot repository](https://oss.sonatype.org/content/repositories/snapshots/co/vorobyev/exitsign/).

Dependency lines for release: 

    <dependency>
      <groupId>co.vorobyev</groupId>
      <artifactId>exitsign</artifactId>
      <version>0.1-alpha</version>
    </dependency>

Dependency lines for snapshot: 

    <dependency>
      <groupId>co.vorobyev</groupId>
      <artifactId>exitsign</artifactId>
      <version>0.2.0-SNAPSHOT</version>
    </dependency>

## Usage
    
Simple usage:
    
```java

import static co.vorobyev.exitsign.StandardExitStatus.FAILURE;
import static co.vorobyev.exitsign.StandardExitStatus.SUCCESS;
    
/**
 * This is example class that demonstrates 'main class' with using exit statuses.
 */
public class App {
    
    /**
     * Utility constant imitating valid arguments.
     */
    public static final String[] validArgs = {"valid"};
    
    /**
     * Validates application arguments.
     *
     * @param args application arguments.
     * @return true if arguments is valid else false.
     */
    private static boolean isValid(String[] args) {
      return Arrays.equals(args, validArgs);
    }
    
    /**
     * Executes app with propounded arguments.
     *
     * @param args app arguments.
     */
    public static void main(String... args) {
      ExitStatus status;
    
      if (isValid(args)) {
        status = SUCCESS;
      } else {
        status = FAILURE;
      }
    
      System.exit(status.code());
    }
    
}
```

More complex usages you can get from unit and integration tests. We follow "Tests as Examples" idea.    
    
## Documentation 

Exit Sign's documentation is stored in the gh-pages branch and is available online at 
[http://vorobyev.co/exitsign/](http://vorobyev.co/exitsign/).

## Feedback and Support
 
Please send any feedback to e-mail [anton@vorobyev.co](mailto:anton@vorobyev.co).
 
Bugs and feature requests leave at [https://github.com/antonvorobyev/exitsign/issues](https://github.com/antonvorobyev/exitsign/issues).

## Contributing

You have three options if you have a feature request, found a bug or simply have a question about
Exit Sign:

* Write [issues](https://github.com/antonvorobyev/exitsign/issues).
* Create a pull request. See ["Understanding the GitHub Flow"](https://guides.github.com/introduction/flow/index.html).
* Write a mail to [anton@vorobyev.co](mailto:anton@vorobyev.co).

## Development

Exit Sign is build with Maven. If you want to contribute code than

* Please write a test for your change.
* Ensure that you didn't break the build by running mvn verify.
* Fork the repo and create a pull request. Exit Sing uses GitHub Flow.

Your pull request will be automatically build by our continuous integration servers.

### Continuous Integration

Exit Sign loves continuous integration and we use wonderful 
[Travis CI](https://travis-ci.org/antonvorobyev/exitsign). 
 
Now our build status for master [![Build Status](https://travis-ci.org/antonvorobyev/exitsign.svg?branch=master)](https://travis-ci.org/antonvorobyev/exitsign)

### Source Code Style

We follow predefined rules of source code styling. Our choice is ["Google Code Style"](http://google.github.io/styleguide/javaguide.html).

You can install preconfigured settings into your IDE configuration. For IntelliJ IDEA download the
[intellij-java-google-style.xml](https://raw.githubusercontent.com/google/styleguide/gh-pages/intellij-java-google-style.xml)
and copy it into your code styles folder in your IntelliJ settings folder (e.g. ~/.IntelliJIdea15/config/codestyles/).
And after enable "GoogleStyle" in IDE settings of Java code style.
 
Build settings of Exit Sign project configured for style checking using checkstyle. It is validated
at build start phase (mvn validate) and fill report when called maven site goal.

## Related Resources

All bookmarks to related resources are collected at [Delicious](https://delicious.com/anton.vorobyev/exitsign).

## Copyright and License
 
Code copyright 2015 Anton Vorobyev. Code released under 
[Apache License, Version 2.0](https://github.com/antonvorobyev/exitsign/blob/master/LICENSE) 


[travis]:https://travis-ci.org/antonvorobyev/exitsign/builds
[travis img]:https://secure.travis-ci.org/antonvorobyev/exitsign.svg?branch=master

[mavenbadge]:http://search.maven.org/#search|gav|1|g%3A%22co.vorobyev%22%20AND%20a%3A%22exitsign%22
[mavenbadge img]:https://maven-badges.herokuapp.com/maven-central/co.vorobyev/exitsign/badge.svg

[license]:LICENSE
[license img]:https://img.shields.io/badge/license-Apache%20v2.0-blue.svg
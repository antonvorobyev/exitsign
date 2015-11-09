# Exit Sign
[![][travis img]][travis]
[![][mavenbadge img]][mavenbadge]
[![][license img]][license]

Exit Sign is utility library for handy usage of exit statuses in Java software.

## Continuous Integration

Exit Sign loves continuous integration and we use wonderful 
[Travis CI](https://travis-ci.org/antonvorobyev/exitsign). 
 
Now our build status for master [![Build Status](https://travis-ci.org/antonvorobyev/exitsign.svg?branch=master)](https://travis-ci.org/antonvorobyev/exitsign)

## Source Code Style

We follow predefined rules of source code styling. Our choice is ["Google Code Style"](http://google.github.io/styleguide/javaguide.html).

You can install preconfigured settings into your IDE configuration. For IntelliJ IDEA download the
[intellij-java-google-style.xml](https://raw.githubusercontent.com/google/styleguide/gh-pages/intellij-java-google-style.xml)
and copy it into your code styles folder in your IntelliJ settings folder (e.g. ~/.IntelliJIdea15/config/codestyles/).
And after enable "GoogleStyle" in IDE settings of Java code style.
 
Build settings of Exit Sign project configured for style checking using checkstyle. It is validated
at build start phase (mvn validate) and fill report when called maven site goal.

## Related Resource

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
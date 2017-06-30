# gatling-sbt-template

Template project for running gatling.io tests with sbt

## Setup

1. Make sure you have a Java JDK version 7 or later.
2. Install sbt (scala build tool)
   - OSX  ```$ brew install sbt```
   - others: http://www.scala-sbt.org/release/tutorial/Setup.html

## Use

```
$ cd gatling-sbt-template
$ sbt # starts the sbt console
> testOnly example.ExampleTest
```

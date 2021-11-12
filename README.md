# README

This is a simple cookiecutter template for Apache Spark SQL project in Scala.

## How to use this template

```bash

### Requirement: Python3 & Cookiecutter

~/git$ pip3 install cookiecutter

### Create new project with cookiecutter

~/git$ cookiecutter https://github.com/jazzwang/init-spark-stream
repo_name [spark-stream]: new-spark-stream   ### Enter the project name

### Initial Git repo

~/git$ cd new-spark-stream/
~/git/new-spark-stream$ git init
~/git/new-spark-stream$ git add .
~/git/new-spark-stream$ git commit -m 'initial project'
[master (root-commit) 7214ec1] initial project
 5 files changed, 77 insertions(+)
 create mode 100644 .gitignore
 create mode 100644 build.sbt
 create mode 100644 src/main/resources/log4j.properties
 create mode 100644 src/main/resources/spark-defaults.conf
 create mode 100644 src/main/scala/Hello.scala

### How to use SBT to run the example

~/git/new-spark-stream$ sbt run
```
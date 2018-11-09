# Cam-ItG-EnvSetup
FLOSS (Free, Libre, Open Source Software) setup scripts for Cambridge Uni CST Intro to Graphics course, and a NativePathModifier class to allow you to set the native path at runtime

## How to use

To use, download the file (big green Clone or Download button) and unzip it to wherever you want to use it

Then open a command line and run `./gradlew eclipse` or `./gradlew idea`, and gradle will automatically set you up
an environment for either IDE. Because we are using LWJGL2 and LWJGL2 is kind of terrible (in comparison to more modern
versions), we need to extract the natives, thus you also need to run `./gradlew natives` which will automagically extract
them to the "lib/natives/*".

You then just open this project with your IDE 

For eclipse, you right click on the package explorer tab, and select import

For IDEA you can either open it, or run `./gradlew openIdea`

### NativePathModifier

This is an old class I used to use, back when LWJGL2 was something worth using. It allows you to set the native java path
at runtime, instead of having to setup your path by using `-Djava.native.path=[blah]` before 
hand you just call `NativePathModifier.setLibraryPath("[blah]");` before calling any lwjgl methods.

If you use the gradle setup script, you replace the "[blah]" with "lib/natives"

## Explanation

### What is this
This is a Gradle build script for automatically downloading and setting up a gradle environment on any platform

### Why is this
Because the method described in the course describes using is terrible and involves manually installing and setting up everything


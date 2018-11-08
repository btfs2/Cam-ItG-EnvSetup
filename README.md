# Cam-ItG-EnvSetup
CC0'd setup scripts for Cambridge Uni CST Intro to Graphics course

## How to use

To use, download the file (big green Clone or Download button) and unzip it to wherever you want to use it

Then open a command line and run `./gradlew eclipse` or `./gradlew idea`, and gradle will automatically set you up
an environment for either IDE

You then just open this project with your IDE 

For eclipse, you right click on the package explorer tab, and select import

For IDEA you can either open it, or run `./gradlew openIdea`

## Explanation

### What is this
This is a Gradle build script for automatically downloading and setting up a gradle environment on any platform

### Why is this
Because the method described in the course describes using LWJGL 2 instead of LWJGL 3 (which notes on old lecture notes say they are not using)

And because their method involves manually setting up stuff, which is silly.

Furthermore, doing it automatically will add stuff like javadoc and source links to the jar files, meaning you can actually use your IDEs built in
ability to show you what functions do


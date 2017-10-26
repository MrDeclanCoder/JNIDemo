JNIDemo

javac JniDemo.java
gcc -I/usr/local/jdk1.8.0_91/include/ -fPIC -shared -o libnative.so native.c export LD_LIBRARY_PATH=.
java JniDemo

#include <jni.h>
#include <stdio.h>

#include "Main.h"

JNIEXPORT void JNICALL
Java_Main_sayHello (JNIEnv *env, jobject thisObj) {
    printf("%s", "13213");
    return;
}
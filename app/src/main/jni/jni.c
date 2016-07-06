#include <jni.h>
#include <creditcloud_com_myndkjnidemo_MyJni.h>
JNIEXPORT jstring JNICALL Java_creditcloud_com_myndkjnidemo_MyJni_print
  (JNIEnv *env, jobject job, jstring jstr){

    return (*env)->NewStringUTF(env,"通过jni来自c语言哦");
}
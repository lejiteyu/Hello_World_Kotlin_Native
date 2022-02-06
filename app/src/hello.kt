
/**
 * 1.下載kotlin native : https://github.com/JetBrains/kotlin/releases/
 * 裡面的檔案,選擇需要的版本下載
 * 然後解壓縮....
 * 可以看到檔案夾內會有個bin檔案
 *
 * 2.設定環境變數
 * 打開終端機 執行
 * #nano ~/.bash_profile
 * 新增下面指令(看你bin路徑為何！？)
 * export PATH=$PATH://Users/Kotlin_Native/kotlin-native-macos-xxxx/bin/
 *
 * 編譯檔案:
 * #kotlin-native hello.kt -o hello
 * #./hello.kexe
 * 第一次使用需要確定可以打開lib之權限
 *
 * Ref:https://blog.csdn.net/vitaviva/article/details/105035106
 *
 */

fun main(arg:Array<String>) {
    println("Hello world!!")
}



# Giữ lại class kế thừa Application
-keep class com.tool.pif.App extends android.app.Application { *; }

# Giữ lại Worker
-keep class androidx.work.Worker { *; }

# Giữ lại các BroadcastReceiver
-keep class com.tool.pif.BootReceiver { *; }

# Giữ lại class có thể dùng qua reflection (nếu có)
-keepclassmembers class * {
    @android.webkit.JavascriptInterface <methods>;
}

# Giữ Activity
-keep class com.tool.pif.MainActivity { *; }

# Giữ lại các class sử dụng bằng reflection (nếu có)
-keepclassmembers class * {
    public <init>(...);
}

# Giữ lại các method được gọi qua WorkManager (nếu dùng)
-keep class androidx.work.Worker { *; }
-keep class * extends androidx.work.Worker { *; }

# Tùy vào project, bạn có thể bổ sung các rule riêng cho:
# - Gson / Retrofit / getIdentifier / Room / các View binding,...
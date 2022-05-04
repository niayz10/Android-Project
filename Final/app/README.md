# News application

## Description of the project
News application is an application where you can see news from 6 countries:
    1. India,
    2. USA,
    3.  Australia,
    4.  Russia,
    5.  France,
    6.  Great Britain.

On the main screen you can select a country, after clicking on the country you have selected, you
will see a screen on which you can select the news category:
    1.  Business
    2.  entertainment program
    3.  general
    4.  health
    5.  science
    6.  sport
    7.  Technology

After you select a category, you will see a news list for this category. 
You can click on any news you are interested in and read more about this news. 
At this stage you can find out the name of the author of the article, the date of publication, the link to the whole text news.

## Structure of the project
The project structure consists of 5 folders: adapter, api, dao, fragments, models; and classes: Database, MainActivity, MyApplication, Service.

## Installed apps or Prerequisites
### In build gradle(:app)
Room database:
    def room_version = "2.2.5"
    implementation "androidx.room:room-runtime:$room_version"
    kapt "androidx.room:room-compiler:$room_version"

Retrofit:
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
    implementation 'com.squareup.okhttp3:logging-interceptor:4.9.0'

Navigation:
    implementation "android.arch.navigation:navigation-fragment-ktx:1.0.0"
    implementation "android.arch.navigation:navigation-ui-ktx:1.0.0"

Picasso:
    implementation 'com.squareup.picasso:picasso:2.71828'

Recycleview:
    implementation 'androidx.recyclerview:recyclerview:1.1.0'

### In build gradle(Project)
buildscript {
ext.kotlin_version = '1.4.21'
repositories {
    google()
    jcenter()
}
dependencies {
    classpath "com.android.tools.build:gradle:4.1.1"
    classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
    classpath "org.jetbrains.kotlin:kotlin-android-extensions:$kotlin_version"
    classpath "android.arch.navigation:navigation-safe-args-gradle-plugin:1.0.0"
    // NOTE: Do not place your application dependencies here; they belong
    // in the individual module build.gradle files
}
}

## How to run project
To run this project you need to download it to your laptop or computer. 
Check the dependencies and synchronize with the project.
Create an emulator and run it. After that you can safely run the project.

## API of the project
https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=979f244184bd4a63a779868896b32b8f
link to the site of API: https://newsapi.org/

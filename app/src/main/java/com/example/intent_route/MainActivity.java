package com.example.intent_route;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button and,ios,fullstack;
    ImageView andImg,iosImg,fullImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        and=findViewById(R.id.amdBtn);
        ios=findViewById(R.id.iosBtn);
        fullstack=findViewById(R.id.btnFullStack);
        andImg=findViewById(R.id.andImg);
        iosImg=findViewById(R.id.iosImg);
        fullImg=findViewById(R.id.imgFullstack);
        and.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                String txt="\"1. Introduction to Java Programming\\n\n" +
                        "• Overview.\\n\n" +
                        "• Compiler and JVM\\n\n" +
                        "• Project Structure\\n\n" +
                        "• Hello World Application\\n\n" +
                        "• Variables and Data types\\n\n" +
                        "• Operators\\n\n" +
                        "• Conditional statements ( IF - Switch)\\n\n" +
                        "• Loops ( For - While - Do While)\\n\n" +
                        "2. Basics\\n\n" +
                        "• nested loops\\n\n" +
                        "• Strings\\n\n" +
                        "• Arrays\\n\n" +
                        "• functions\\n\n" +
                        "3. Object Oriented Programming\\n\n" +
                        "• Classes and Objects\\n\n" +
                        "• Encapsulation and data hiding\\n\n" +
                        "• Inheritance\\n\n" +
                        "• Polymorphism\\n\n" +
                        "• Abstraction (Abstract classes - Interfaces)\\n\n" +
                        "4. Collections and Generics\\n\n" +
                        "• Sets, Lists\\n\n" +
                        "• Threading\\n\n" +
                        "• Generics Class and MethodPart 2 (Android Development)\\n\n" +
                        "1. Introduction to Android\\n\n" +
                        "• Android OS\\n\n" +
                        "• Android Versions\\n\n" +
                        "• OS Architecture\\n\n" +
                        "• Application Component\\n\n" +
                        "• Android Studio and Gradle\\n\n" +
                        "• Creating Hello World\\n\n" +
                        "2. UI Components\\n\n" +
                        "• Layouts(Constraints Layout- Linear Layout )\\n\n" +
                        "• Using resources ( drawables, Strings colors, and Styles )\\n\n" +
                        "3. UI Components II\\n\n" +
                        "• Menu\\n\n" +
                        "• Support Localization\\n\n" +
                        "• Support Orientation\\n\n" +
                        "4. Intents and Activities\\n\n" +
                        "• Intents\\n\n" +
                        "• Intent Filters\\n\n" +
                        "5. Fragments\\n\n" +
                        "• what is fragments\\n\n" +
                        "• Fragment manager and transaction\\n\n" +
                        "• tablayout, NavigationDrawer, BottomNavigation\\n\n" +
                        "6. Dialogs• Alert Dialog\\n\n" +
                        "• Display dialog with items\\n\n" +
                        "• Custom dialogs (Dialog Fragment)\\n\n" +
                        "7. Data Storage\\n\n" +
                        "• Shared Preference\\n\n" +
                        "• Room (Database Library) - from google Arch Components\\n\n" +
                        "8. Threading and Services\\n\n" +
                        "• Threading\\n\n" +
                        "• Service and Intent Service\\n\n" +
                        "9. Web services and APIs\\n\n" +
                        "• what is JSON ?\\n\n" +
                        "• how to make network calls and APIs\\n\n" +
                        "• Consuming Web APIs\\n\n" +
                        "• Using Retrofit and Gson Libraries\\n\n" +
                        "• how to cache Apis\\n\n" +
                        "• using Room and Retrofit Together\\n\n" +
                        "• what is Repository Pattern?\\n\n" +
                        "10. FireBase RealTime Database\\n\n" +
                        "• how to deal with Realtime Database\\n\n" +
                        "11. Notifications\\n\n" +
                        "• Simple Notification\\n\n" +
                        "• firebase to push Notifications\\n\n" +
                        "• one signal push notifications SDK\\n\n" +
                        "\n" +
                        "\"";
                int img=R.drawable.android;
                intent.putExtra("txt",txt);
                intent.putExtra("img",img);
                startActivity(intent);
            }
        });
        ios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                String txt="\"1. Introduction to Java Programming\\n\n" +
                        "• Overview.\\n\n" +
                        "• Compiler and JVM\\n\n" +
                        "• Project Structure\\n\n" +
                        "• Hello World Application\\n\n" +
                        "• Variables and Data types\\n\n" +
                        "• Operators\\n\n" +
                        "• Conditional statements ( IF - Switch)\\n\n" +
                        "• Loops ( For - While - Do While)\\n\n" +
                        "2. Basics\\n\n" +
                        "• nested loops\\n\n" +
                        "• Strings\\n\n" +
                        "• Arrays\\n\n" +
                        "• functions\\n\n" +
                        "3. Object Oriented Programming\\n\n" +
                        "• Classes and Objects\\n\n" +
                        "• Encapsulation and data hiding\\n\n" +
                        "• Inheritance\\n\n" +
                        "• Polymorphism\\n\n" +
                        "• Abstraction (Abstract classes - Interfaces)\\n\n" +
                        "4. Collections and Generics\\n\n" +
                        "• Sets, Lists\\n\n" +
                        "• Threading\\n\n" +
                        "• Generics Class and MethodPart 2 (Android Development)\\n\n" +
                        "1. Introduction to Android\\n\n" +
                        "• Android OS\\n\n" +
                        "• Android Versions\\n\n" +
                        "• OS Architecture\\n\n" +
                        "• Application Component\\n\n" +
                        "• Android Studio and Gradle\\n\n" +
                        "• Creating Hello World\\n\n" +
                        "2. UI Components\\n\n" +
                        "• Layouts(Constraints Layout- Linear Layout )\\n\n" +
                        "• Using resources ( drawables, Strings colors, and Styles )\\n\n" +
                        "3. UI Components II\\n\n" +
                        "• Menu\\n\n" +
                        "• Support Localization\\n\n" +
                        "• Support Orientation\\n\n" +
                        "4. Intents and Activities\\n\n" +
                        "• Intents\\n\n" +
                        "• Intent Filters\\n\n" +
                        "5. Fragments\\n\n" +
                        "• what is fragments\\n\n" +
                        "• Fragment manager and transaction\\n\n" +
                        "• tablayout, NavigationDrawer, BottomNavigation\\n\n" +
                        "6. Dialogs• Alert Dialog\\n\n" +
                        "• Display dialog with items\\n\n" +
                        "• Custom dialogs (Dialog Fragment)\\n\n" +
                        "7. Data Storage\\n\n" +
                        "• Shared Preference\\n\n" +
                        "• Room (Database Library) - from google Arch Components\\n\n" +
                        "8. Threading and Services\\n\n" +
                        "• Threading\\n\n" +
                        "• Service and Intent Service\\n\n" +
                        "9. Web services and APIs\\n\n" +
                        "• what is JSON ?\\n\n" +
                        "• how to make network calls and APIs\\n\n" +
                        "• Consuming Web APIs\\n\n" +
                        "• Using Retrofit and Gson Libraries\\n\n" +
                        "• how to cache Apis\\n\n" +
                        "• using Room and Retrofit Together\\n\n" +
                        "• what is Repository Pattern?\\n\n" +
                        "10. FireBase RealTime Database\\n\n" +
                        "• how to deal with Realtime Database\\n\n" +
                        "11. Notifications\\n\n" +
                        "• Simple Notification\\n\n" +
                        "• firebase to push Notifications\\n\n" +
                        "• one signal push notifications SDK\\n\n" +
                        "\n" +
                        "\"";
                int img=R.drawable.ios;
                intent.putExtra("txt",txt);
                intent.putExtra("img",img);
                startActivity(intent);
            }
        });
        fullstack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                String txt="\"1. Introduction to Java Programming\\n\n" +
                        "• Overview.\\n\n" +
                        "• Compiler and JVM\\n\n" +
                        "• Project Structure\\n\n" +
                        "• Hello World Application\\n\n" +
                        "• Variables and Data types\\n\n" +
                        "• Operators\\n\n" +
                        "• Conditional statements ( IF - Switch)\\n\n" +
                        "• Loops ( For - While - Do While)\\n\n" +
                        "2. Basics\\n\n" +
                        "• nested loops\\n\n" +
                        "• Strings\\n\n" +
                        "• Arrays\\n\n" +
                        "• functions\\n\n" +
                        "3. Object Oriented Programming\\n\n" +
                        "• Classes and Objects\\n\n" +
                        "• Encapsulation and data hiding\\n\n" +
                        "• Inheritance\\n\n" +
                        "• Polymorphism\\n\n" +
                        "• Abstraction (Abstract classes - Interfaces)\\n\n" +
                        "4. Collections and Generics\\n\n" +
                        "• Sets, Lists\\n\n" +
                        "• Threading\\n\n" +
                        "• Generics Class and MethodPart 2 (Android Development)\\n\n" +
                        "1. Introduction to Android\\n\n" +
                        "• Android OS\\n\n" +
                        "• Android Versions\\n\n" +
                        "• OS Architecture\\n\n" +
                        "• Application Component\\n\n" +
                        "• Android Studio and Gradle\\n\n" +
                        "• Creating Hello World\\n\n" +
                        "2. UI Components\\n\n" +
                        "• Layouts(Constraints Layout- Linear Layout )\\n\n" +
                        "• Using resources ( drawables, Strings colors, and Styles )\\n\n" +
                        "3. UI Components II\\n\n" +
                        "• Menu\\n\n" +
                        "• Support Localization\\n\n" +
                        "• Support Orientation\\n\n" +
                        "4. Intents and Activities\\n\n" +
                        "• Intents\\n\n" +
                        "• Intent Filters\\n\n" +
                        "5. Fragments\\n\n" +
                        "• what is fragments\\n\n" +
                        "• Fragment manager and transaction\\n\n" +
                        "• tablayout, NavigationDrawer, BottomNavigation\\n\n" +
                        "6. Dialogs• Alert Dialog\\n\n" +
                        "• Display dialog with items\\n\n" +
                        "• Custom dialogs (Dialog Fragment)\\n\n" +
                        "7. Data Storage\\n\n" +
                        "• Shared Preference\\n\n" +
                        "• Room (Database Library) - from google Arch Components\\n\n" +
                        "8. Threading and Services\\n\n" +
                        "• Threading\\n\n" +
                        "• Service and Intent Service\\n\n" +
                        "9. Web services and APIs\\n\n" +
                        "• what is JSON ?\\n\n" +
                        "• how to make network calls and APIs\\n\n" +
                        "• Consuming Web APIs\\n\n" +
                        "• Using Retrofit and Gson Libraries\\n\n" +
                        "• how to cache Apis\\n\n" +
                        "• using Room and Retrofit Together\\n\n" +
                        "• what is Repository Pattern?\\n\n" +
                        "10. FireBase RealTime Database\\n\n" +
                        "• how to deal with Realtime Database\\n\n" +
                        "11. Notifications\\n\n" +
                        "• Simple Notification\\n\n" +
                        "• firebase to push Notifications\\n\n" +
                        "• one signal push notifications SDK\\n\n" +
                        "\n" +
                        "\"";
                int img=R.drawable.fullstack;
                intent.putExtra("txt",txt);
                intent.putExtra("img",img);
                startActivity(intent);
            }
        });
    }
}
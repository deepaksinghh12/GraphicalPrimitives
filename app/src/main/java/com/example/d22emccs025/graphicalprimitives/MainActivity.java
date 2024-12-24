package com.example.d22emccs025.graphicalprimitives;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a Bitmap
        Bitmap bg = Bitmap.createBitmap(720, 1280, Bitmap.Config.ARGB_4444);

        // Set the Bitmap as background for the ImageView
        ImageView i = (ImageView) findViewById(R.id.imageView);
        i.setImageBitmap(bg);

        // Create the Canvas Object
        Canvas canvas = new Canvas(bg);

        // Create Paint object and set its properties
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);

        // Draw House Base (Square for Walls)
        paint.setColor(Color.LTGRAY);
        canvas.drawRect(250, 700, 470, 1000, paint);

        // Draw Roof (Triangle)
        paint.setColor(Color.DKGRAY);
        Path roofPath = new Path();
        roofPath.moveTo(235, 700); // Left corner
        roofPath.lineTo(360, 550); // Top point
        roofPath.lineTo(485, 700); // Right corner
        roofPath.close();
        canvas.drawPath(roofPath, paint);

        // Draw Door (Rectangle)
        // Draw Door (Rectangle)
        paint.setColor(Color.rgb(165, 42, 42)); // Brown color
        canvas.drawRect(340, 850, 380, 1000, paint);


        // Draw Left Window (Square)
        paint.setColor(Color.CYAN);
        canvas.drawRect(270, 750, 310, 790, paint);

        // Draw Right Window (Square)
        canvas.drawRect(410, 750, 450, 790, paint);

        // Optional: Draw Sun (Circle)
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(600, 200, 80, paint);

        // Optional: Draw Grass (Horizontal Line)
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(10);
        canvas.drawLine(0, 1000, 720, 1000, paint);
    }
}

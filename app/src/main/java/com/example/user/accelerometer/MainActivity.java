package com.example.user.accelerometer;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.hardware.SensorEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SensorEventListener{
    private TextView A,B,C;
    private Sensor sensor;
    private SensorManager smanager;

    @Override
    public void onSensorChanged(SensorEvent event) {

        A.setText("X-axis: "+event.values[0]);
        B.setText("Y-axis: "+event.values[1]);
        C.setText("Z-axis: "+event.values[2]);
    }
    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {


    }@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        smanager=(SensorManager) getSystemService(SENSOR_SERVICE);
        sensor=smanager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        smanager.registerListener(this,sensor,SensorManager.SENSOR_DELAY_NORMAL);
        A=(TextView)findViewById(R.id.textView1);
        B=(TextView)findViewById(R.id.textView2);
        C=(TextView)findViewById(R.id.textView3);  }
}

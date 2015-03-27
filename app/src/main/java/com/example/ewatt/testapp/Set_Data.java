package com.example.ewatt.testapp;

/**
 * Created by ewatt on 3/27/15.
 */
public class Set_Data {

    public int set_time, weight, reps;

    public Set_Data(byte[] b)
    {
        set_time = Workout_Data.byteArrayToInt(b, 2);
        weight = Workout_Data.byteArrayToInt(b+2, 2);
        reps = Workout_Data.byteArrayToInt(b[4], 1);

    }
}

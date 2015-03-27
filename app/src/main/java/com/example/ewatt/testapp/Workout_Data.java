package com.example.ewatt.testapp;

/**
 * Created by ewatt on 3/27/15.
 */
public class Workout_Data {

    public int user_id, machine_id, num_sets;
    public Set_Data set;

    public static int byteArrayToInt(byte b*, int arr_length)
    {
        int value = 0;
        for (int i = 0; i < arr_length; i++) {
            int shift = (arr_length - 1 - i) * 8;
            value += (b[i] & 0x000000FF) << shift;
        }
        return value;
    }
}
